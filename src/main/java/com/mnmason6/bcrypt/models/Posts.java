//package com.mnmason6.bcrypt.models;
//
//import javax.persistence.*;
//
//@Entity
//public class Posts {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    long id;
//    String text;
//
//    @ManyToOne
//    Eweser userPosts;
//
//    public Posts(){
//    }
//
//    public Posts(String text) {
//        this.text = text;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public Eweser getUserPosts() {
//        return userPosts;
//    }
//
//    public void setUserPosts(Eweser userPosts) {
//        this.userPosts = userPosts;
//    }
//}
