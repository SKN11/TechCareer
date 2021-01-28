package cpm.spring.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringSPEL {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		String helloSpel = "'Hello SPEL'";
		String helloConcat = "'Hello SPEL'.concat(' with concat')";  
		String helloLength = "'Hello SPEL'.length()";  
		String helloUpper = "'Hello SPEL'.toUpperCase()";  
		
		
		//Expression exp = parser.parseExpression(helloSpel); 
		//Expression exp = parser.parseExpression(helloConcat);
		Expression exp = parser.parseExpression(helloUpper);
		
		String message = (String) exp.getValue();  
		//Integer message = (Integer) exp.getValue();  
		System.out.println(message);   
		

	}

}
