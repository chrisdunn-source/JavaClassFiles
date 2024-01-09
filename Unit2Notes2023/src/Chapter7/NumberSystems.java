package Chapter7;

public class NumberSystems {
    public static void main(String[] args) {


        int binary1 = 0b011;    // assign a binary number to an integer variable
        int binary2 = 0b101;    // assign a binary number to an integer variable

        int oct1 = 010;    // assign an octal number to an integer variable
        int oct2 = 020;    // assign an octal number to an integer variable

        int hex1 = 0x10;    // assign a hex number to an integer variable
        int hex2 = 0xFF;    // assign a hex number to an integer variable

        Integer value1 = 100;
        System.out.println(value1 + " (decimal), ");
        System.out.println(Integer.toBinaryString(value1) + " (binary), ");
        System.out.println(Integer.toOctalString(value1) + " (octal), ");
        System.out.println(Integer.toHexString(value1) + " (hex), ");



        int binResult = binary1 + binary2;  // binary addition
        int octResult = oct1 + oct2;  // octal addition
        int hexResult = hex1 + hex2;  // hex addition

        System.out.println(binary1 + " + " + binary2 + " = " + binResult);
        System.out.println(binResult + " decimal = " + Integer.toBinaryString(binResult) + " binary");

        System.out.println(oct1 + " + " + oct2 + " = " + octResult);
        System.out.println(octResult + " decimal = "  + " = " + Integer.toOctalString(octResult) + " octal");

        System.out.println(hex1 + " + " + hex2 + " = " + hexResult);
        System.out.println(hexResult + " decimal = "  + " = " + Integer.toHexString(hexResult) + " hex");

        int binResult2 = binary2 - binary1;  // binary subtraction
        int octResult2 = oct2 - oct1;  // octal subtraction
        int hexResult2 = hex2 - hex1;  // hex subtraction

        System.out.println(binary2 + " - " + binary1 + " = " + binResult2);
        System.out.println(binResult2 + " decimal = " + Integer.toBinaryString(binResult2) + " binary");

        System.out.println(oct2 + " - " + oct1 + " = " + octResult2);
        System.out.println(octResult2 + " decimal = "  + " = " + Integer.toOctalString(octResult2) + " octal");

        System.out.println(hex2 + " - " + hex1 + " = " + hexResult2);
        System.out.println(hexResult2 + " decimal = "  + " = " + Integer.toHexString(hexResult2) + " hex");












    }
}
