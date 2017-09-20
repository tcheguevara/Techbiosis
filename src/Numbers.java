
public class Numbers {
	private String number;
	private boolean flag;
	public Numbers(){}
	public String numberToString(int n,int casas)
 	{
		//String onde vamos construir o numero por extenso 
		number="";
		//Flag para confirmar que existiu algum numero, por exemplo: 100 000 123, não dizemos cem milhões zero mil cento e vinte e três, a flag serve para prevenir imprimir o zero mil...
		flag=false;
		//Se o numero tiver 3 digitos
		if(n>=100)
		{
			int centenas=n/100;
			int dezenas=(n%100)/10;
			int unidades=(n%100)%10;
			//Vai buscar o primeiro digito
			number+=oneDecimals(centenas) + "hundred ";
			//Vai buscar o segundo digito(as dezenas têm casos especiais como é o caso dos numeros de 10 a 20)
			if(dezenas==1)
				number+=teens(n%100);
			else
			{
				number+=twoDecimals(dezenas);
				number+=oneDecimals(unidades);
			}
			flag=true;
		}
		//Não está entre os numeros de 10 a 20
		else if(n>=20)
		{
			number+=twoDecimals(n/10);
			number+=oneDecimals(n%10);
			flag=true;
		}
		else if(n>=10)
		{
			number+=teens(n);
			flag=true;
		}
		//Se apenas existe unidades..
		else if(n>0)
		{
			flag=true;
			number+=oneDecimals(n);
		}
		//Se entrou em qualquer destes casos(ou seja, se não era 000)
		if(flag)
			number+=nCasas(casas);
		return number;
	}
	private String twoDecimals(int n)
	{
		switch (n) {
		case 2:
			return "twenty ";
		case 3:
			return "thirty ";
		case 4:
			return "fourty ";
		case 5:
			return "fivety ";
		case 6:
			return "sixty ";
		case 7:
			return "seventy ";
		case 8:
			return "eighty ";
		case 9:
			return "ninety ";
		default:
			return "";
		}
	}
	private String oneDecimals(int n)
	{
		switch (n) {
		case 1:
			return "one ";
		case 2:
			return "two ";
		case 3:
			return "three ";
		case 4:
			return "four ";
		case 5:
			return "five ";
		case 6:
			return "six ";
		case 7:
			return "seven ";
		case 8:
			return "eight ";
		case 9:
			return "nine ";
		default:
			return "";
		}
	}
	private String teens(int n)
	{
		switch (n) {
		case 10:
			return "ten ";
		case 11: 
			return "eleven";
		case 12:
			return "twelve ";
		case 13: 
			return "thirteen";
		case 14:
			return "fourteen ";
		case 15: 
			return "fiveteen";
		case 16:
			return "sixteen ";
		case 17: 
			return "seventeen ";
		case 18:
			return "eighteen ";
		case 19: 
			return "nineteen ";
		default: 
			return "";
		}
	}
	private String nCasas(int n)
	{
		switch (n){
		case 1: 
			return "thousand ";
		case 2: 
			return "million ";
		case 3:
			return "billion ";
		default:
			return "";
		}
	}
}



