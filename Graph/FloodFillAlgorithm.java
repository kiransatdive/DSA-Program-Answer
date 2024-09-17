package Graph;

public class FloodFillAlgorithm {
    public void helper(int[][] image, int sr, int sc, int color, boolean visit[][], int orgcol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visit[sr][sc]
                || image[sr][sc] != orgcol) {
            return;
        }

        // Set the current pixel to the new color
        image[sr][sc] = color;
        visit[sr][sc] = true;

        // Explore adjacent pixels
        helper(image, sr, sc - 1, color, visit, orgcol); // left
        helper(image, sr, sc + 1, color, visit, orgcol); // right
        helper(image, sr - 1, sc, color, visit, orgcol); // up
        helper(image, sr + 1, sc, color, visit, orgcol); // down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean visit[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, visit, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        FloodFillAlgorithm fill = new FloodFillAlgorithm();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] result = fill.floodFill(image, sr, sc, newColor);

        // Print the updated image
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
