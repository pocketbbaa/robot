package service.impl;

import model.Comment;
import org.springframework.stereotype.Service;
import service.CommentService;

import java.util.List;

/**
 * Created by admin on 2016/6/27.
 */
@Service
public class CommentServiceImpl implements CommentService {


    @Override
    public List<Comment> getCommentListByPage(Long courseId) {


        return null;
    }

    @Override
    public boolean addComment(Long userId, Long courseId, Comment comment) {


        return false;
    }

    @Override
    public boolean delComment(Long id) {


        return false;
    }
}
