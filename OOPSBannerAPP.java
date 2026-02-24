/**
* OOPSBannerAPP UC4 -Render OOPS As a banner using String Array Loops
*
*
*@author Devoloper
*@version 4
*/
public class OOPSBannerAPP {
	public static void main(String[] args){
		String[] lines= new String[9];
		lines[0] = String.join(" ", "    ***   ", "      ***  ", "    ******", "         *****");
		lines[1] = String.join(" ", "  **   ** ", "    **   ** ", "   **     ** ", "    **     ");
        lines[2] = String.join(" ", " **     **  ", " **     **  ", " **      ** ", " **       ");
		lines[3] = String.join(" ", " **     **  ", " **     **  ", " **	 ** ", "    **     ");
		lines[4] = String.join(" ", " **     **  ", " **     **  ", " ******* ", "        ***  ");
		lines[5] = String.join(" ", " **     **  ", " **     **  ", " **	  ", "            ** ");
		lines[6] = String.join(" ", " **     **  ", " **     **  ", " **	 ", "               ** ");	
		lines[7] = String.join(" ", "  **   **  ", "   **   **  ", "  **	 ", "             **  "); 
		lines[8] = String.join(" ", "    ***  ", "       ***   ", "   **	 ", "        *****  "); 
		for (String line : lines){
			System.out.println(line);
			}
		}
	}


