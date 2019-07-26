package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.dao.ArticleCommentDao;
import com.dtkq.api.service.ArticleCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArticleComment)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
@Service("articleCommentService")
public class ArticleCommentServiceImpl implements ArticleCommentService {
    @Resource
    private ArticleCommentDao articleCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArticleComment queryById(Integer id) {
        return this.articleCommentDao.queryById(id);
    }

    @Override
    public List<ArticleComment> queryAllByLimit(ArticleComment entity) {

                List<ArticleComment>  list =  this.articleCommentDao.queryAll(entity);
                for(int i=0;i<list.size();i++){
                    ArticleComment obj=list.get(i);
                    ArticleComment checkParam=new ArticleComment();
                    checkParam.setParentId(obj.getId());
                    checkParam.setLimit(50);//显示的评论数
                    obj.setCommentList(articleCommentDao.countNum(checkParam));
                }
        return list;
    }

    /**
     * 新增数据
     *
     * @param articleComment 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleComment insert(ArticleComment articleComment) {
        this.articleCommentDao.insert(articleComment);
        return articleComment;
    }

    /**
     * 修改数据
     *
     * @param articleComment 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleComment update(ArticleComment articleComment) {
        this.articleCommentDao.update(articleComment);
        return this.queryById(articleComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.articleCommentDao.deleteById(id) > 0;
    }
    @Override
    public ArticleComment addNum(ArticleComment articleComment) {
        this.articleCommentDao.addNum(articleComment);
        return this.queryById(articleComment.getId());
    }

}