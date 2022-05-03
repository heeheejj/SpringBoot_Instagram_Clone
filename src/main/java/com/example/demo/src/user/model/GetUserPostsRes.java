package com.example.demo.src.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetUserPostsRes {
//    private boolean _isMyFeed;
//    private int postIdx;
//    private List<GetUserPostsRes> getUserPosts;
    private int postIdx;
    private String postImgUrl;
}
