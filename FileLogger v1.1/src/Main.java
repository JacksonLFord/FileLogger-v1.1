import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Main {
    static FileLogger fl = new FileLogger();
    static boolean exitS= false;
    public static void main(String[] args){
        while(exitS == true || exitS == false){
            while(exitS == true){
                Scanner scaner = new Scanner(System.in);

                String sr = (scaner.nextLine());



                if (sr.equalsIgnoreCase("!JStart")){
                    exitS = false;

                }
            }
            while(exitS == false ){
                Scanner scan = new Scanner(System.in);
                String s = (scan.nextLine());
                boolean isDone = false;
                if (s.equalsIgnoreCase("!JQuit")){
                    exitS = true;

                    isDone = true;
                }


                String[] Words = s.split(" ");
                String keyword = Words[0];

                if(keyword.equalsIgnoreCase("isdir") ){
                    try{
                    if (Words[1] == null){
                        fl.isDir();
                        isDone = true;
                    }
                    if (Words[1] != null) {
                        fl.isDir(Words[1]);
                        isDone = true;
                    }
                    else{

                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("todir") ){
                    try{
                    if(Words[1] != null){
                        fl.toDir(Words[1]);
                        isDone = true;
                    }
                    else{
                        System.out.println("Missing Parameters");
                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("isfile") ){
                    try{
                    if (Words[1] == null){
                        fl.isFile();
                        isDone = true;
                    }
                    if (Words[1] != null) {
                        fl.isFile(Words[1]);
                        isDone = true;
                    }
                    else{

                    }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("tofile") ){
                    try {
                        if (Words[1] != null) {
                            fl.toFile(Words[1]);
                            isDone = true;
                        } else {
                            System.out.println("Missing Parameters");
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("makefile") ){
                    try{
                    if(Words[1] != null){
                        fl.makeFile(Words[1]);
                        isDone = true;
                    }
                    else{
                        System.out.println("Missing Parameters");
                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("makefolder") ){
                    try{
                    if(Words[1] != null){
                        fl.makeFolder(Words[1]);
                        isDone = true;
                    }
                    else{
                        System.out.println("Missing Parameters");
                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("write") ){
                    //s is the input
                    String[] wording = s.split(" ");
                    List<String> list = new ArrayList<String>(Arrays.asList(wording));
                    list.remove(0);
                    int index90 = list.size();
                    int index91 = 0;
                    String fin = "";
                    while(index91<index90){
                        fin = fin + " " +list.get(index91);
                        index91 = index91+1;
                    }
                    fl.write(fin);
                    isDone = true;


                }
                if(keyword.equalsIgnoreCase("writehere") ){
                    //s is the input
                    String[] wording = s.split(" ");
                    List<String> list = new ArrayList<String>(Arrays.asList(wording));
                    list.remove(0);
                    int parsedint = Integer.parseInt(list.get(0));
                    list.remove(0);
                    int index92 = list.size();
                    int index93 = 0;
                    String fin = "";
                    while(index93<index92){
                        fin = fin + " "+ list.get(index93);
                        index93 = index93+1;
                    }

                    fl.write(parsedint , fin);
                    isDone = true;



                }
                if(keyword.equalsIgnoreCase("readall") ){

                    System.out.println(fl.readAll());
                    isDone = true;


                }
                if(keyword.equalsIgnoreCase("read") ){
                    try{
                    if(Words[1] != null){
                        int index95 = Integer.parseInt(Words[1]);
                        fl.read(index95);
                        isDone = true;
                    }
                    else{
                        System.out.println("Missing Parameters");
                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if(keyword.equalsIgnoreCase("clearall") ){

                   fl.clear();
                    isDone = true;

                }
                if(keyword.equalsIgnoreCase("clear") ){
                    try{
                    if(Words[1] != null){
                        int index96 = Integer.parseInt(Words[1]);
                        fl.clear(index96);
                        isDone = true;
                    }
                    else{
                        System.out.println("Missing Parameters");
                    } }catch (Exception e){
                        System.out.println(e);
                    }
                }
                else{

                    if(isDone == false){
                        System.out.println("Command does not meet standards");
                    }
                    if(isDone == true){

                    }
                }






            }
        }







    }
}
