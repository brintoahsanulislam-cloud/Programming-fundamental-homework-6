
package task4;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

    public static long calculateSize(File directory) {

        long totalSize = 0;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {

                if (file.isFile()) {
                    totalSize += file.length();
                } else if (file.isDirectory()) {
                    totalSize += calculateSize(file);
                }
            }
        }

        return totalSize;
    }

    public static void displaySize(String name, long bytes) {

        double kb = bytes / 1024.0;
        double mb = bytes / (1024.0 * 1024.0);

        System.out.println("Directory: " + name);
        System.out.printf("Size: %.2f MB | %.2f KB | %d bytes%n",
                mb, kb, bytes);
        System.out.println();
    }

    public static void displayDirectories(File directory) {

        long size = calculateSize(directory);
        displaySize(directory.getAbsolutePath(), size);

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    displayDirectories(file);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("Error: Directory does not exist.");
        } else if (!directory.isDirectory()) {
            System.out.println("Error: The path is not a directory.");
        }   else {
            System.out.println("Directory sizes:");
            displayDirectories(directory);
        }

        input.close();
    }
}

