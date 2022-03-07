package string_Manipulation;

public class Find_palendrome {
public static  boolean ispalendrome(String star1) {
	int i =0,j=star1.length()-1;
	while(i<j) {
		if(star1.charAt(i)!=star1.charAt(j)) {
			return false;
		}
		i++;
		j--;
	
		
	}
	
	return true;
	
}

public static void main(String[] args) {
	
	String star1="abbaa";
	if(ispalendrome(star1)) {
		System.out.println("Strings are palendrome");
	}
	else {
		System.out.println("Strings are not palendrome");
	}
}


}
