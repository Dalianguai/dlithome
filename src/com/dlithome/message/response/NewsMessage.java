package com.dlithome.message.response;

import java.util.List;  

public class NewsMessage extends BaseMessage {

	public NewsMessage() {
		// TODO Auto-generated constructor stub
	}
	
    private int ArticleCount;  
   
    private List<Article> Articles;  
  
    public int getArticleCount() {  
        return ArticleCount;  
    }  
  
    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  
  
    public List<Article> getArticles() {  
        return Articles;  
    }  
  
    public void setArticles(List<Article> articles) {  
        Articles = articles;  
    }  
}
