package view;
import java.util.*;
import biz.SCBiz;
import view.MainUI;
public class CourseSelection {
	public static void main(String[] args) {
		MainUI.show();
	}
	public static void show() {
		String studentNo;
		int flag=0;
		while(true) {
			if(flag==1)  break;
			System.out.println("\n，，，，，，，，，，，，，，，，，，，，僥伏僉仁狼由，，，，，，，，，，，，，，，，，，，，\n");
			System.out.println("     ，，，，，，，，，，，，，辛參序佩泌和孔嬬:，，，，，，，，，，，，，\n");
			System.out.println("\t|，，，，，，，1，，，，，，， 仁殻僉夲       \t|");
			System.out.println("\t|，，，，，，，2，，，，，，， 臥心厮僉仁殻\t|");
			System.out.println("\t|，，，，，，，3，，，，，，， 曜僉              \t|");
			System.out.println("\t|，，，，，，，4，，，，，，， 曜竃僉仁狼由\t|");
			System.out.println("\n，，，，，，，，，，，，，，，，，，，，-----------，，，，，，，，，，，，，，，，，，，，\n");
	        SCBiz scbiz = new SCBiz();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch(scanner.nextLine()){
			case"1":
				System.out.println("\n，，，，萩補秘僥催��");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.choose(studentNo);
				break;
			case"2":
				System.out.println("\n，，，萩補秘僥催��");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
	        	scbiz.result(studentNo);
				break;
			case"3":
				System.out.println("\n，，，萩補秘僥催��");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.tuixuan(studentNo);
				break;
			default:
				flag=1;
				System.out.println("\n，，，，，，，厮曜竃僉仁狼由，，，，，，，\n");
				MainUI.show();
				break;
			}
		}
	}
}
