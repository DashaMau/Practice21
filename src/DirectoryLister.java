import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {

    public static void main(String[] args) {
        String directoryPath = "c:/Windows/";
        List<String> filesList = listDirectoryContents(directoryPath);

        System.out.println("Первые 5 элементов в каталоге:");
        for (int i = 0; i < Math.min(5, filesList.size()); i++) {
            System.out.println(filesList.get(i));
        }
    }

    public static List<String> listDirectoryContents(String directoryPath) {
        List<String> filesList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    filesList.add(file.getName());
                }
            }
        } else {
            System.out.println("Указанный путь не является каталогом.");
        }
        return filesList;
    }
}

