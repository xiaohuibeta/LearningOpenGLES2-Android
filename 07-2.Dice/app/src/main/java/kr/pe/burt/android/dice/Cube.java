package kr.pe.burt.android.dice;

import kr.pe.burt.android.dice.glkit.ShaderProgram;

/**
 * Created by burt on 2016. 6. 23..
 */
public class Cube extends Model {

    static final float vertices[] = {
            // Front
             1, -1, 1,      1, 0, 0, 1,     0.25f, 0f,      // 0
             1,  1, 1,      0, 1, 0, 1,     0.25f, 0.25f,   // 1
            -1,  1, 1,      0, 0, 1, 1,     0f, 0.25f,      // 2
            -1, -1, 1,      0, 0, 0, 1,     0f, 0f,         // 3

            // Back
            -1, -1, -1,     0, 0, 1, 1,     0.5f, 0f,       // 4
            -1,  1, -1,     0, 1, 0, 1,     0.5f, 0.25f,    // 5
             1,  1, -1,     1, 0, 0, 1,     0.25f, 0.25f,   // 6
             1, -1, -1,     0, 0, 0, 1,     0.25f, 0f,      // 7

            // Left
            -1, -1,  1,     1, 0, 0, 1,     0.75f, 0f,      // 8
            -1,  1,  1,     0, 1, 0, 1,     0.75f, 0.25f,   // 9
            -1,  1, -1,     0, 0, 1, 1,     0.5f, 0.25f,    // 10
            -1, -1, -1,     0, 0, 0, 1,     0.5f, 0f,       // 11

            // Right
             1, -1, -1,     1, 0, 0, 1,     1f, 0f,         // 12
             1,  1, -1,     0, 1, 0, 1,     1f, 0.25f,      // 13
             1,  1,  1,     0, 0, 1, 1,     0.75f, 0.25f,   // 14
             1, -1,  1,     0, 0, 0, 1,     0.75f, 0f,      // 15

            // Top
             1, 1,  1,      1, 0, 0, 1,     0.25f, 0.25f,   // 16
             1, 1, -1,      0, 1, 0, 1,     0.25f, 0.5f,    // 17
            -1, 1, -1,      0, 0, 1, 1,     0f, 0.5f,       // 18
            -1, 1,  1,      0, 0, 0, 1,     0f, 0.25f,      // 19

            // Bottom
             1, -1, -1,     1, 0, 0, 1,     0.5f, 0.25f,    // 20
             1, -1,  1,     0, 1, 0, 1,     0.5f, 0.5f,     // 21
            -1, -1,  1,     0, 0, 1, 1,     0.25f, 0.5f,    // 22
            -1, -1, -1,     0, 0, 0, 1,     0.25f, 0.25f,   // 23

    };

    static final short indices[] = {

            // Front
            0, 1, 2,
            2, 3, 0,

            // Back
            4, 5, 6,
            6, 7, 4,

            // Left
            8, 9, 10,
            10, 11, 8,

            // Right
            12, 13, 14,
            14, 15, 12,

            // Top
            16, 17, 18,
            18, 19, 16,

            // Bottom
            20, 21, 22,
            22, 23, 20
    };

    public Cube(ShaderProgram shader) {
        super("cube", shader, vertices, indices);
    }
}
