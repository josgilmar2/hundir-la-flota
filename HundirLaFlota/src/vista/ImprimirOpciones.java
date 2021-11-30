package vista;

public class ImprimirOpciones {
	
private int inicio = 0;
	
	public ImprimirOpciones () {
		
		this.inicio=inicio;
		
		
		}
	
	public static void animacion () throws InterruptedException{
		int tam=10, tam2=15, tam3=10, tam4=25;
		System.out.println("\t\t\tLOADING ....");
		Thread.sleep(3000);
		
		for (int i=0;i<tam;i++) {
			System.out.printf("■");
			Thread.sleep(300, 0);

		}
		for (int i=0;i<tam2;i++) {
			System.out.printf("■");
			Thread.sleep(200, 0);

		}
		for (int i=0;i<tam3;i++) {
			System.out.printf("■");
			Thread.sleep(80, 0);

		}
		for (int i=0;i<tam4;i++) {
			System.out.printf("■");
			Thread.sleep(20, 0);

		}
		//▓ ■ 	┌───  
		      //│ ■
		      //└───
		      //┌─
		      //│■
		      //└─
		
	}
	public static void bosco (){
		
		System.out.println("hhhhhhhhyyyyyyyyyyyhhyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyysssyyyyyyyssyyyyyys\n"+
				"yyhhhhyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyysssyyyyyyyyyyyyyyyyyyyyysyyyyysyyyssyyyys\n"+
				"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyysssssyssssssyysssssyssyyyyyyyssyyyyyysssssssssyyysssssss\n"+
				"yyyyyyyyyyyyyyyyyyssyyyyysyyyyyyyyssysyyyyyyssyyyysyyyyyysssssssssssyyyyssssssssssssssssssssssssssss\n"+
				"yyyyyyyyyyyyyyyssssssssssssyyysssssssssyyyyssyhhhdhhhhhhhyysssssssssyyyyysssssssssssssssssssssssssss\n"+
				"yyyyyyyyyyyyysysssssssssssssyssssssssyydmmmmmmmNNNNNNNNmddhyysssssyyssssssssssssssssssssssssssssssss\n"+
				"yyyyyssyyyyyyyysssssssssssssssssssyyhmNMMMNNNNNNNNMMMMMMNNNmdhhhhhyyyssssssssssssssssssssssssyssssss\n"+
				"yysssssssssyyysssssssssssssssyhhddmNNMMMMMNNNNNNNNNNMNNNNNNNNNNNNmmdhyyyssssssssssssssssssssssssssss\n"+
				"ssssssssssyyyysssssssssssssymNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmmmNNNNNmmmddhyyssssssssssssssssssssssss\n"+
				"ysssssssssssssssssssosymmNNNNNNNNNmdddmmmNNNNNNNNNNmmmmmmmmmmmmmmNNNNNNmmdhyssssssssssssssssssssssss\n"+
				"ssssssssssssssssssssymNMMMNMNNNNmdhyhdmmmmmmdmmmmddmmmmmdddddddddddmmmmmdhyhyoosssssosssssssssssssss\n"+
				"ssssssssssssssssssyhmNNNNMNNmmNNmdhhdddmmdhyhddddyhmmmmmdhysyhdhyyyyyhdddddhyo++ooossssssossssssssss\n"+
				"sssssssssssssssssdNNMMMMMNmdhdmdhhhhhhhyyysyyyyyyyhdmmmmmdhyyyyhysssyhyhhyhdhhs+++osssooosssssssssso\n"+
				"sssssssssssssssydNNNNNNNNdhhhdhhyyyyyyssssyyyyyyhhyyhdmmmddhhhyyysssosossoshhhys/++oossoossssoosssoo\n"+
				"sssssssssssssssdNNNNNNNNmmmddhyyssso+oossshddddddhooosyhdhhyyso++++osoooooshhyys+/ooosoossssoooosooo\n"+
				"ssssssssssssssmNMMMMMMMNNNmdhyysso+//:+ssyyhdhhys+///++ossssoo+/:/+sooooosyyyysso/osooossssooooooooo\n"+
				"sssssssssssssymNMMMMMNNNNmdyssso++/::/++//oooo/::------:::::::////+ssooosyhyyyyyyoyyyssooooooooooooo\n"+
				"sssssssssssssyNMMMMMMNNmdhyssso++//////:::/::-....``````..```...-:/+so+++oyyyyyhhhyhyysooooooooooooo\n"+
				"ssssssssooossdNMMMMMMNmmdhysso++//////:---...```````````````   ````.-//:--/oyyhdddhhhhyooooooooooooo\n"+
				"sssssssoooooodNMNNNNNNmmhsssoo++////:::--....```````` ``` `        ````....-:+yhhdddddo++ooooooooooo\n"+
				"sooossoooooosmNNmmNNNNmdysoooo++////:::---....``````                `````....-+yyyyhdd++++oooooooooo\n"+
				"oooooooooooshmmmmNNNNmmhsoossso+++///:::---....````                 ```````...-+yhhhdms+++++++oooooo\n"+
				"oooooo+oosyydmNMMMMMNmddhsoosssoo+///:---..````````                 ` `````...:+oyhddhs+++++++++oooo\n"+
				"oooooooosymNNMMMMNNNNmmdhysoooooo+//::-...```````````  ````        ````````...:+oyhddds+++o+++++oooo\n"+
				"ooooooosdmNNNMMNNNNNNNmmdysooooo+//:::----..``````````````````    ````````...-/osyhddhs+++++++++oooo\n"+
				"oooooooohmNNNNNNmmNNMNmdyo+oooo+//---...---..`````````````````````` ``````...:+yhhhddys+++++++++oooo\n"+
				"oooooooosydmNNNMMNNMNNmyo++oooo+:::::::://:-..`.--.......`````````  ``````.../ohhhssddy//+++++++++oo\n"+
				"ooooooooooymNMMMMMMNNNhoo++ooo++sysssssysso+/---::-....--....-........``.....:sddhs:/yy///++++++++++\n"+
				"oooooooooosdNMMMMNMNmmyoo++oooshddhhyyyyhhhhhyys+/:..``.:////so++++o++/:-....:sddddooso+++++++++++++\n"+
				"oooooooooooyNMMMNNMNmdso+++oosyhyssosoooossosyhhy+:.````-/++oosssso++oo+:-.`..+shddyyso+//++++++++++\n"+
				"oooooooooooymhhdNNNmmyooo+++oosssshdyhdmo+-+yyhyy+-``  `.-/+ooohmhyoo/:++/-.`.-/shdoosso+/////++++++\n"+
				"oooooooooo+ohdhydNNmdsoo++++++osssyssoo+/--:+ssso+-`` ``.::++//oss+:+oo+//-.``.-+yyo+oyo///////+++++\n"+
				"oooooooo+++oyhhhhdmmhso++++///////////:::--::/+++/-.`  ``...-:::-------:/-..``../sy/:+oo/////////+++\n"+
				"++++oo++++++syyyydddhsoo+/////::::::::---..--:////:.`  ```````......````..`````.:so-so///////////+++\n"+
				"+o++++++++++ossyddhyyssoo++///::---........-:://::-.`  ````````````````````````.-/:-////////////////\n"+
				"+++++++++++++oshddooyyssooo+///::--.......--:://::-``  `````````  ` ``````````.-:-..-://////////////\n"+
				"+++++++++++++osyhyoosyyyssoo++///:----...-:/+oo+::.`    ```..````````````````.--:/..-://////////////\n"+
				"+o++++++++++++osysoosyyyyssoooo++/:::---:+oss+++/:-``    ``.-:-.````````````..-:-:..-///////////////\n"+
				"++++++++++++++osssysosyyyyssssoo++//:::/+ssoo+++++:-.`````.`.://-..```````...-----`.:///////////////\n"+
				"++++++++++++++oooosssoyyyyyssssoo+++//++oo//syyyyys+/-...-:-.`.-/:-....`....-----.`.://///://///////\n"+
				"++++++++++++++++++oossyyyyyyssssoo+++++++/:/syhhhhhhyo+///:.````.:/-.......----...`-://:::://///////\n"+
				"+++++++++++++//+++++osyyyyyyssssoo++++++////osyyyyysoo+-......```.//--.....--:-...-/::::::::////////\n"+
				"+++++++++++++///+ooshysyyyyysssoo+//++++++//++ooooo+///-..........-/:-....--::.``.:::::::/://///////\n"+
				"+++++++++++++////+osoosyyyssssooo++/+ooooo++++++++/:-::-......----.::-....--::.``-::::::///:::////:/\n"+
				"++++++++++///////////osyyssssooooo//osyyyyssssoooo+:--:--------/+/::-.....--:/::::::::://///://////:\n"+
				"+++++++++////////////+yyssssssosso+/+syhdddhhhhhyysssoo++++o+/:://:-......--::::::::::::////////////\n"+
				"//+//////////////////+syyysssssssso/+oossyyyysso+//::/:------....---......--::::::::::::/:::::://///\n"+
				"//++////+/////////////ohyyyyssssssoo++++oooooooo++/////::--.......----....--::::::::::/::::://://///\n"+
				"///+//////////////////+shhhyyssssssso++++++++oooo+//::-----.......---------:::::::::::::::::/://////\n"+
				"///+///////////////////+yhhhhyysssssso++++++++ooo+//:----.........--------::::::::::::::::://://////\n"+
				"////////////////////////shhhdhhyssssssoo++++++///::---...........-----:::::::::::::::::::::::://///:\n"+
				"///////////////////////+syyhdddhyyyyyyysooo++///:::----.......----::::://:::::::::::::::::::::::::::\n"+
				"////////////////////++:+syyyyhddddhhhhhhyssooo+////::::------::::::::///::::::::::::::::::::::::::::\n"+
				"//////////////////+yms--/syyyyhhdddddddddhhysssoo++++++//////////:::://:::::::::::::::::::::::::::::\n"+
				":////////////////+sNNm+::/+syyyhhdddddddhhhhhhhyyysssssooo+++//:::::::::::::::::::::::::::::::::::::\n"+
				"///////////////++smNMMms+/::+oyhhhhhddhhhhhhhhhhhyyyssssoo++/////::--:::::::::::::::::::::::::::::::\n"+
				"///////////++ooyhNNNMMMMmyo///++osyyhhddhhhyyyyyysyssssssoooo++//:--..::::::::::::::::::::::::::::::\n"+
				"///+++oosyhdmNNMMMMMMMMMMMNmhso+++++oosyhhyyssssssssssyyssoo++/:::-.`-:://::::::::::::-:::::-:::::::\n"+
				"osyhdNNNMMMMMMMMMMMMMMMMMMMMMNNdyso+++/++++oooooo++++++++++//::--.` -s////::::::::::::::::::::::::::\n"+
				"NNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmhyso+/::--------------...``` `-ohdo////::::::::::::::::-------::\n"+
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMNNNmhyo/:.```         `.-/ohdmmms+////::::::-:::::::--------:-\n"+
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmhyo+-   ./+osyhdmmNNNNNmdhyso+//::::::::::::--::-----\n"+
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmdy``:hdmmmNNNNNNNNNMMMMNNmdhso///:::::::::-::-----\n"+
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNd:+dmNNNNNMMMNNNNNNNMMMMMMNNmdyo+/:::::::--:-----\n"+
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNdNNNMMMMMMMNNNNNNNNNNNNMMMMMMNmmhyo//:::::------\n"+
				"MMMMMNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNmmmNNMMMMMNNmdhs+/:-------\n"+
				"NNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNMMMMMMMMMMMMMMNNmmmmmmmmmmNNNNNNNNNmmhyo//:::-\n"+
				"NNNNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMNNMMMMMMMMMMMMMMNNNmmmmmmmmddddddmmNNNMNNmmdhys+/\n"+
				"NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMNmMMMMMMMMMMMMMMMMNNmmmmmmmmmmmmddddddmNMMNNNNmmdh\n"+
				"NNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNNNNNNMMMMMMMMMMMMMmNMMMMMMMMMNNNMMMMNNmmmmmmmmdmmmmdddddmmmmmNNNNNNN\n");
	}

}
