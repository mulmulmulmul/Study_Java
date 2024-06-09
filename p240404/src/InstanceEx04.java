/*
 * 같은 경로(패키지)에 같은 이름의 class는 생성 불가
 * - 경로를 바꾸거나 
 * - class명을 바꾸면 해결
 * 
 */

class FruitTwo {
	int count;
	String sort;
	
	// setter/getter ==================================== 메서드 사이에는 화이트라인
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getSort() {
		return sort;
	}
	
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}

public class InstanceEx04 {

	public static void main(String[] args) {

		
		
	}

}
