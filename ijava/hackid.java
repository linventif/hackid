
from extensions.File import *
class hackid extends Program{
    void algorithm(){
        //println("Hello World");
        //String str = readString();
        // print the content of the file ../languages/languages.json
        String[] files = getAllFilesFromCurrentDirectory();
        for(int i = 0; i < files.length; i++){
            println(files[i]);
        }
        extensions.File; newFile("test.txt");
    }
}