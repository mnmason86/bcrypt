package com.mnmason6.bcrypt.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Eweser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String username;
    private String password;

//    @OneToMany(mappedBy = "userPosts", cascade = CascadeType.ALL)
//    @OrderBy("text")
//    List<Posts> postsList;

    public Eweser(){
    }

    public Eweser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

//    public List<Posts> getPostsList() {
//        return postsList;
//    }
//
//    public void setPostsList(List<Posts> postsList) {
//        this.postsList = postsList;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
