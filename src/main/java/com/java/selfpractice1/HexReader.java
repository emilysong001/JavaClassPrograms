package com.java.selfpractice1;

public class HexReader {
    //Hex 十六进制
    //hexadecimal
    //decimal 十进制
    //binary 二进制
    //Octal 八进制

    String[] input = { "000A110D1D260219 ",
            "78700F1318141E0C ",
            "6A197D45B0FFFFFF " };

    public static void main(String[] arguments) {
        HexReader hex = new HexReader();
        for (int i = 0; i < hex.input.length; i++)
            hex.readLine(hex.input[i]);
    }

    void readLine(String st) {
        try {
            for (int j = 0; j + 1 < st.length(); j += 2) {
                String sub = st.substring(j, j + 2);
                int num = Integer.parseInt(sub, 16);
                /*if (num == 255) {
                    return;
                }*/
                System.out.print(num + " ");
            }
        } finally {
            System.out.println("**");
        }
    }
}
