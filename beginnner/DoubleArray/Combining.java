package DoubleArray;

import java.util.Arrays;

public class Combining {
    public static void main(String[] args) {
        int[][] imageData = {
                {100, 90, 255, 80, 70, 255, 60, 50},
                {255, 10, 5, 255, 10, 5, 255, 255},
                {255, 255, 255, 0, 255, 255, 255, 75},
                {255, 60, 30, 0, 30, 60, 255, 255}
        };

        // First, we want to crop the image down to a 4x6 image, removing the right 2 columns.
        int[][] newImage = new int[4][6];

        // Use nested for loops to copy over the data from the original image to the new image.
        for (int i = 0; i < newImage.length; i++) {
            for (int j = 0; j < newImage[i].length; j++) {
                newImage[i][j] = imageData[i][j];
            }
        }

        System.out.println("Cropped Image:");
        System.out.println(Arrays.deepToString(newImage));

        // Decrease the brightness of the new image by 50 units.
        for (int i = 0; i < newImage.length; i++) {
            for (int j = 0; j < newImage[i].length; j++) {
                // Subtract 50 from the pixel value, but make sure it doesn't go below 0.
                newImage[i][j] = Math.max(0, newImage[i][j] - 50);
            }
        }

        System.out.println("Decreased Brightness Image:");
        System.out.println(Arrays.deepToString(newImage));
    }
}
