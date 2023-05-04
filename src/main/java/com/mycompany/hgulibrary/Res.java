/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author shinhookim
 */
public class Res {
    private static Res single_instance = null;
    Res(){
        bookList = new ArrayList<BookInfo>();
    }
    public static synchronized Res getInstance()
    {
        if (single_instance == null)
            single_instance = new Res();
  
        return single_instance;
    }
    
    private String[] bookTitles = { "역사에게 길을 묻다", "역사는 커뮤니케이션이다", "역사와 인식", "한국 기독교와 역사", "이성의 역사", "기독교 역사", "역사와 오늘", "역사를 위하여", "역사문화수첩", "역사와 도시", "커뮤니케이션의 역사", "컴퓨터 비전", "C++ 컴퓨터 알고리즘", "컴퓨터 개론", "컴퓨터 네트워크", "컴퓨터는 어떻게 움직이는가? : 작동원리", "컴퓨터 구조학", "Computer Graphics", "Fundamentals of Computer Algorithms", "Computer Integrated manufacturing", "Elementary Computer Graphics", "화학이 좋아지는 책: 화학에의 재입문", "화학의 시대", "대화학 제2판", "기초물리화학", "화장품 화학개론", "거의 모든 물질의 화학", "전기화학", "전자의 이동 화학: 전기화학입문", "화학의 첫걸음", "유기합성 화학", "분석화학", "유기금속화학", "생활 과학", "생활과 과학: 자연과학개론", "과학이 몰랐던 과학", "과학과 메타과학 : 자연과학의 구조와 의미", "과학으로 본 창조", "중성자 과학", "인간과 과학", "자연과학과 기원", "사회 속의 과학", "두 얼굴의 과학", "서양과학의 흐름", "자연 과학 흐름", "전통 과학 건축" };
    
    private ArrayList<BookInfo> bookList;
    
    public void init(){
        for(String title : bookTitles){
            UUID uuid = UUID.randomUUID();
            BookInfo bookInfo = new BookInfo(title, uuid.toString(), "123");
            for(int i=0; i<3; i++){
                bookInfo.addBook(new Book("", null, bookInfo));
            }
            bookList.add(bookInfo);
        }
    }
}
