package BalanceBracket;

public class Blance {
	public static void main (string[] args) {
		String bracketexpression = "[{()}]";
		System.out.println("Balance Brackets");
		
	} else  {
		System.out.println("NotActiveException BalanceBrackets Brackets");
	}
		
	static boolean checkbalance(String bracketsCharactern) {
		
	Stack<E> <character> stack = new stack<Character>();
	For  (int i = 0; i < bracketExpression.length(); i++) {
		
	char character = bracketExpression.CharAt (i);
	if (character == '(' || character == '[' || character == '{') {
		stack.push(character);
		continue;
		
	}
	if (stack.isEmpty()) {
		 return false;
		 
	}
		character c;
		switch (character) {
		case '}':
			c=stack.pop();
			if (c == '(' || c== '[') {
				return false;
				
			}
			break;
		case ')':
			c = stack.pop();
			if (c =='(' || c == '[') {
				return false;
			}
			break;	
			
	case ']':	
		c = stack.pop();
		if (c =='(' || c == '{') {
			return false;
		}
		break;	
		default:
			break;
		}
		}
		return stack.isEmpty();
	}
}
