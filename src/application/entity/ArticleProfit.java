package application.entity;

public class ArticleProfit {
	
	private String articleName; 
	private Float profit;
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public Float getProfit() {
		return profit;
	}
	public void setProfit(Float profit) {
		this.profit = profit;
	}
	public ArticleProfit(String articleName, Float profit) {
		super();
		this.articleName = articleName;
		this.profit = profit;
	} 
	
	
	
}
