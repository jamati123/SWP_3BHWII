package FileWriter;

class FileWriter {
    public static void main(String[] args) {
        String filename = "test.txt";
        String text = "Dies ist ein Testtext.";
        writeToFile(filename, text);
    }
    private static void writeToFile(String filename, String text) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(filename);
            fw.write(text);
            fw.close();
        } catch (java.io.IOException e) {
            System.out.println("Fehler beim Schreiben der Datei!");
        }
    }
}
