/*
"Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P,
at a given position relative to a mid-point, Q has a corresponding point, P1, which is the same distance from Q but in the opposite direction.
Task
Given two points P and Q, output the symmetric point of point P about Q.
Each argument is a two-element array of integers representing the point's X and Y coordinates.
Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.
 */
public class Reflections {
    public static void main(String[] args) {
        int[] p = new int[]{2, 6};
        int[] q = new int[]{-2, -6};
        reflectPoint(p, q);
    }

    public static void reflectPoint(int[] p, int[] q) {
        int[] points = new int[2];
        points[0] = q[0] * 2 - p[0];
        points[1] = q[1] * 2 - p[1];
        for (int i = 0; i < 2; i++) {
            System.out.println(points[i]);
        }
    }

}
