package LogicalProgram;

public class DuplicateValuesFromString {

	public static void main(String[] args) {
	
		String s="abcxyzabcabc1xyz";
		int count;
        char a[] = s.toCharArray();

        System.out.println("duplicate characters");
        
        for (int i = 0; i < a.length; i++) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[i] != ' ') {
                    count++;
               a[j] = '0';
                }
            }
      
            if (count > 1 && a[i] != '0')
               System.out.println(a[i]);	}
	}}
