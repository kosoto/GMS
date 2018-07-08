package controller;

import java.util.List;

import javax.swing.JOptionPane;
import domain.*;
import sevice.*;

public class ExamController {
	public static void main(String[] args) {
		ExamBean exam = null;
		MemberBean mem = null;
		while(true) {			
			switch(JOptionPane.showInputDialog("0.종료 1.이름/월 입력 2.성적입력")) {
			case "0" : return;
			case "1" : 
				exam = new ExamBean();
				List<MemberBean> list = MemberServiceImpl.getInstance().readSome(JOptionPane.showInputDialog("이름입력"));
				
				exam.setMemId("c3");
				/*if(list.size() ==0) {
					System.out.println("해당 이름이 없음");
				}else if(list.size() ==1){
					exam.setMemId(list.get(0).getMemberId());
				}else {
					System.out.println(list);
				}*/
				exam.setMonth(JOptionPane.showInputDialog("달 입력"));
				break;
			case "2" : 
				exam.setScore(JOptionPane.showInputDialog(
						"자바,SQL,HTML5,R,PYTHON 순으로 성적입력"));
				ExamServiceImpl.getInstance().createExam(exam);
				break;
			
			default : return;
			
			}
			
		}
		
		
	}
}
