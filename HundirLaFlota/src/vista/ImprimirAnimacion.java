package vista;

public class ImprimirAnimacion {
	
private int inicio = 0;
	
	public ImprimirAnimacion () {
		
		this.inicio=inicio;
		
		
		}
	
	public static void animacion () throws InterruptedException{
		int tam=10, tam2=15, tam3=10, tam4=25;
		
		//SYSO CARGA DEL JUEGO.
		
		
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
		Thread.sleep(80, 0);
		
		//SYSOS CREADORES

		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				+ "\n\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#8dMHOQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QDMG5E@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0z}YixuQ@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#Wx~'     `c#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@gy(,      :H@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Rx}ZBBRMX.h@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#dr-     `:)x-`E@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0y:`     ,<vr =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O<O#M]})!Q~^@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Qk_     -iPB@@V`)#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0r`     ;ID@@B) y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O-B#~)$uYQ@,w@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QV`     ^Z#@@@@I .B@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0~`    -uR@@@@B: c@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o @yy8sW@#uu@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#K.    `xd@@@@@#z  6@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B*`    :PB@@@@@d: <@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Q!VOTYR@Qr}@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Q!    `iE@@@@@@#< 'Q@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@w_     M#@@@@@@G` x#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B)^xcc}LQ@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$-    rO@@@@@@@d! `d@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B]    .L#@@@@@@#r` ;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#$R$B@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@V.    j@@@@@@@@G` .X@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B,    ;Q@@@@@@@#<  x#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@h   `*#@@@QyQ@#r  `9@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:   'q@@@@Uk@@d!  *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@i`  `Z@@@Qy=Z@#;  -H@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Q^   ^$@@@$^k#@P`  u#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@E   'R@@Qk. B@Z!  'g@@@@0o*()*g@@@@@@@@@@@@@@@@@@@@@@@@@@@@~  `)@@@$^`y@#*   v@@@@@@Dzr:_~l@@@@@@@@@#6Tr::}e0@@@@@@@@Q9#@@@@@##@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#~  _d@Qy. YB#K`  :6@@#M<   `` >#@@@@@@B#@#########Q#@@@@@@$   k#@D^`-o@9~   *@@@@#y;  .x^  e@@@@@@9T-   .`  `#@@@@@@u. :@@@Q\'-c@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@E`  W8Y` _k@#^   _B@#W,    vb- i@@@@@Q)!Qv----__--. .q@@@@@h  :QP!` !Q@M`   V#@@#T,  -iQw, `8@@@@Gr   ,yMx` :G@@@@#y!  !E@g)'  :Q@@@@@@#Mrg@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B!  _` `rB@O=   -Q@Q!    `V#x `B@@#d^_o#8_'````      ~@@@@@R  ``  .3##U`  `}@@@M!  `|QO~  rE@@@Br   !Z#m=  ~#@@@Qh,   :BE^`  `y#@@@@@@m,:D@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0-  'vg@@G`   ^8@I-  !w``x= `k@QV_.yQ@@@BBBBQQQQQ8gg#@@@@@@v. `!XB@#>   `d@@@K`  `wj:  rW@@@#}-   d#M*  `j#@@DT._!  *y=`   .Z@@@@@#k='U#@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#ggB@@#*`   ^#@P`  =#@W`   !L!`:IB@@@@@@@@@@@@@@@@@@@@@@@@@B0B@@@Z!    Z@@@6`  -`  !xD@@@gx_  `z#d(   `W@#K)`-cx   _`)^  r8@@@@#c:`~8@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O=    k#@Q`   #@@0` `._!}W#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#U`   :B@@@8_  ?#9P0@@@8I!`   'Obv`   .3gL: -jO!   `xZ*` r@@@@Q]_ :O@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@x    ^$@@#*  !@@d) `*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@E-   `x@@@@@T  r@@@BDkv. '     =_`^M-  -- `<0Q^`  _m##^  r@@Qu- .vB@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@#WciIO<   `v@@@@#=  ^c*  :O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@gKx}Dv`   -9@@@@@@z  `=!`    ^PO      !O@5     r$@W-  :T#@@O`  _:`  -xB@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@b*-~wQI`   -R@@@@@@G`    >y#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Bc>.*R8~    vQ@@@@@@@#v      rmg@@#-  `rs@@@$- -}6@@@$xxm#@@@@B~     .TB@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@X> ~e@Q!    xQ@@@@@@@@QPIMg@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@gr.`rQ@z_   -y@@@@@@@@@@@E33Og@@@@@@@BG58@@@@@@B0#@@@@@@@@@@@@@@@B}*^vMB@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@m= `y@@V-   `X@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Bc` !g@Qx    ~B@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@8v  )D@Dr    v0@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O- .q##q'   _M#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@Q. -y@@k`   ^G@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@]` :Q@Q~   'vB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@Q: -Q@M*   ^K@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Z  }#Bv'  .?Q@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@z `uUr  -LZ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@v -6y-  >uB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@BT=!~rV5#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0*=!>xag@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				
	}
		//▓ ■ 
		      //┌─
		      //│■ 
		      //└─ //
		
	
	//IMAGEN DE DON BOSCO PARA EL ONE PIECE.
	
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
