#include <iostream>

using namespace std;

#include <Windows.h>
#include <mmsystem.h>
#include <iostream>
#include <fstream>



int main()
{

	int userAnswer;

	cout << "Type 1 to Play All Star or 0 to stop. " << endl;
	cin >> userAnswer;

	switch (userAnswer)
	{
	case 1:
	{
		cout << "You have selected Shrek Go FullScreen for a better experience" << endl;
		cout << "After second system pause press any key to end program." << endl;
		system("pause");
		cout << R"(                                                                                                                                                                                                                                                                  
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNXXKKKKKKXXXXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMWNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXK0OkkxxxxxxxxxkkkkkO00KXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMNKOkxdkXWMMMMMMMMMMMMMMMMMMMMMMWXKOkxxxxxkkkkkkkkkkOOOOOOOkkOO0KNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMWKkkkxo:lkKWMMMMMMMMMMMMMMMMMMWXOkddxxxkkkkkkOOOOOOOOOOOOOOOOOOOOkO0KNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMWKkOOOko,;xOXWMMMMMMMMMMMMMMMWKkooddxxkkkkkkkkOOOOOOOOOOOOO00OOOOOOOOkOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMXOO0OOOd,'dOOXMMMMMMMMMMMMMWXkolooddxxdddxxkOOOOOOOOOOOOOOO000O0OOOOOOOOO0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMW0kO0OOOxccxkkOXMMMMMMMMMMMNOlclloolcc:;,;;:clooxxkkkOO00OOO00000OOOOOOOOOkkKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMKdoxxxxxdxxxxxOXWMMMMMMMMXdcclllc;''',;;;;;;;:;::::clxO0KKKKKKKK00OOOOOOOOkkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMWXkdoc;;;:ldxxxk0XWMMMMW0l:ccclc;,:cloddddddddoollclldk0KXXXXXXKKKK00OOOOOOkkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMWX0kxolccoxxxkOKNWW0occccccllodddxxxddddddddddddxxkO0KKKKXXKKKOxdooddxxxddx0XWMMMMMMMMMMMMMMMMWXKKKXWMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMWXkdooxxxxkOkdolc:::clodddddddddddooooooooddxkO000KKKKKOxolcc::::::::coOWMMMMMMMMMMMMMWKOkkxkOKWMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0dloddddollc:::clooddddooooloodddoollloodxxkO00K00Okxddooooollcc:::ckNMMMMMMMMMMMNOdkOxxkkOXWMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkccollccccccclloooocccooc:ldoloooolloooddkOO0OOkxddooooooodddddoocckNMMMMMMMMN0xdxOkxkkOO0NMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk;;:cclooodddddolcclxd:'';d00xlcodooooddkOOOOkkxddoooooooddddxxkkdxKMMMMMWX0kdddxkkkkOO00XWMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:;clodxxkkOOOOkdollllc:;::xK0xloxdoodxkkO00OkkxddollooooooodxxxkkkKWWNK0kxxxddoodxxkOO00XWMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l;:lodxxkkOOO00000OkkxdddddxddxxxxxxkkkOOOO00Okxxdooc;;;lk0OdldkkkkOOOkkxxxddoc:;;;;coxkOXMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKl;:cldxxkkOOOO00000KKKK0OOOOOOOkkkxxxkkOOO000000Okxdo:;,,;cOX0xldkkkkkkkkxdxxkkkkxxxddxOKNWMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd;::lodxxkkkOOOOO0000KKK000OkkkkkxxddxkOOO00KKKKKKK0OxxddooodxddxkOOOOkxdxOKNWMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk:;:coddxxxkkkkkkkOOOO00000OdoddxxddooxkkOO0KXXXXXKK00OOOOOkkkkOOO00000OkONWMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMKc;::coddxxxxxxxdooooodxkkkkl;:cclccccloxkkO0KKXXXKK00OOOOOO000KKKKK000000XWMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMWx;;::coddxxxxdoc::::ccodxkkxc,''......';codkO0000000OOOOkOOO00KKKKKKK000000XWMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMM0c;;;:clddxxxdolloddxxkkOOOOkxdlc:,...  .',;:cooddxxxxdolldxkkOO0000000000000XWMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMWx;;;;:clddxkkkdxkkkxxxxkkkkkOOOOOkxdlc;,'',,,,,,;;;;,'....,:okkkkkkkOOOO0000O0NMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMXl;;;:cloxkkO0kdkOxoooodxxkkkOOOO000OOOOkkxdollllclllllloddddk00OkxollodkO000OOXWMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMM0:;;;:loxkO0K0ddOOxoooollodxkkkOO0000KKKKKKKKKK00000000000000000000kdl::oxkOOOO0WMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMWk;;;:codxkO00kddkkxoddxddoooddxkkO000KKKKXXXXXXXKKKKKKKKKKKK000000O0OOxc:oxkOOk0NMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMNd;;;:coxkkO00kddkxddoddxxxxxxddddooodxxkOKXXXXXXXXXXXXXXKKKK000000OOOO0kolxkkkk0WMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMWX0xc;;;:coxkkOOOkdoxxddooddxxxxxkkkkkxddooooodxkkOO00000000000000OOkkkkkO00OkkkkkkKWMMMMMMMMMMMMMMMMMMMM
MMMWWMMMMMMMMMMMMMMWXKOdlcc;;;;:codxkkOOOdoddddoodddxxxkkkkOOOOO0000OkkkkkxxxxdddddxxxkkkkkkkO0O0K00OOOkkkXMMMMMMMMMMMMMMMMMMMMM
MKxodOKWMMMMMMMWN0xoccc::;,,;;;;:codxkkOOxooodddooddxxxxkkkOOOOOOOOO000000KKKKK00000000000000000000O0OOOkONMMMMMMMMMMMMMMMMMMMMM
Nd:;;;:ok0XWWXOdc;;;::;;,'.,;;;;;:lodxkkOkdoooooodddddxxxkkkkOOOOOOOOO0000000000000000000000000000OO0OOOkkKWMMMMMMMMMMMMMMMMMMMM
d;,;:::::::ooc;;;;;;;;,'''',;,,,;;:codxxkkxolooooooddddxxxxxkkkOOOOOOOO00000000000000000000000000OO00OOOxccONWMMMMMMMMMMMMMMMMMM
:,,;;;;;;;;;;,,;;,,,''''''';;,,,,,;:clodxxxdooooooooddddxxxxxkkkkkOOOOO0000000000000000000000000OOO0OOOOd'.:odkKWMMMMMMMMMMMMMWN
,,,,,,,,,,,'',;;,,'''''...,;;;,,,,,;;:lodxxdoooooooooddddxxxxkkkkkkOOOOOOOO000000O0000000O000000OO00OOkkx;.;cc::lONMMMMMMWX0kdlc
'',,,,,,,...';;,''........';;;;,,'',,;:clodddooooooooddddxxxkkkkkkkkkkOOOOOOOOOO0OOOOOOOOOO0000OOOOOOkxxdl''::::,,cx0KKOdc;'...,
',,,,',,'.'''','.........'',;;;;,''',,;;:looddddddddddddxxkkkkOkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkxxdd;.;::c;;,,;:;'..'...,;
,,,'..''................''',;;;;,,'''',,;:clooddddddxxxkkkOOO00000000000000000000OOOOOOOOOOOOOOOOOkxxxxkxo,.;cc:::;,;:,'''''..';
,,'.............. ......'''';;;;,,,'''',,,;;:loodddxxkkOOO00000KKKKXXKKKKKKKKKKK0000OOOOOOOOOOOOkkxdddk0kl,':clol:,,;::;'',,'..;
''......  ..............'''',;;;;,,,,''''',,,;:clloodxxkkOO0000KKKXXXXXXXXXXXXXKKKK00000000OOOOkxddodk00xc'':clol:',:;::;,,,'..;
........................'''',;;;;;,,,,''''''',,;:::cloodxxkOOOO000KKKKXXXXXXXXXKKKKKKKK0000OOkkxdoodk0K0xl''::clc:,,:::cc:;;'..:
........''..............','',,;;;;;,,,,'''''''',,,,;;:llodxxkkkOOOO000000KKKKKKKKK00000000OOkxdoooxO00Kkd:.':cl;,',cl::ccc:;'.'o
  ......................,,''',;;;;;;,,,,'''''''''''',,;:cloddxxxkkkkkOOOOOOOO00000000000OOkxdolldk0000kdl;.',:l;''';c:,;;c:;'.'x
  ................ .....',,'.',;;;;;;,,,,,'''''''''''',,;:clooddddddxxxxxkkkkkkkOOOOOOOkkxolccoxO000Oddx:',;::,,:::;;,;;;cc;..,k
 ................. ......,;,'',;;;;;;;;,,,,,''''''''''''',;;::cllllooooodddddxxxkkkkxxdolc:clxkO000Odll:',:;,,''clol:::,;cc:.'oX
............  ...    ....,;;,.',;;;;;;;;;,,,,,'''''''','',,,,,,;;;;:::::cccllllooooollc:ccoxkOO000klcdd,.;;::;,;;;;clol:;cc;'c0N
..............   ..  ....',;;,',;;;;;;;;;;;;;;,,,'''''',,,,,,,,,,,,,,,,,,;;;;;;;:::::clodxkOO000Okdldo;',,',,,,;c:;clc::;:c;,xXX
...............  .   .....,;;;,',,;;;::;;;;;;;;,,,,,''''''',,,,,,,;;;;;;;;;;;,,;::coddxxkkOO00Oxdooxd;.';;',;,,clc;cc:clllc;:OKX
....  ..... ...       .....;::;'',;;;::::;;;;;;;;;,,,,,''''''''''''''''''',,,;:loddxxxkOOO0OOkl:ldxd:;;,''.',',::::c;,:lllc;cOXX
.....       ..  .   ...  ..';;;,',,,;;:::::;;;;;;;;;;,,,,,,,''''''''''''',;clodxxxxkkOOO00Odlcclxxo;':c;,;;,.,c;,;;,;;,';;::l0XK
..........     ..  ..     ..,::;,'',;;;::::::;;;;;;;;;;,,,,,,,,''''''';:coddxxkkkkkkOO00OOklldxkko,,,,;;,,;;'',',c:,;;'.,;;:o0XK
........'.. .         ....  .;::;;,,,,;;::::::;;;;;;;;;;;;;,,,,,,,,;:lodxxkkkkkkOOOOOkxddxkkkO0kl;.,:;,;:,,,';c;,:,;cc,.';::o0KK
.... .'..  ..             ....;::;;,'',;;:::::::;;;;;;;;;;;;;;:cclodxxkkkkOOOOOOOOOOxlllok0000xc;:;''..:l:,',;ll:;;ccc;',;;cxKKK
...  .. ..        ...   .....';:;;:;;,',,;;;;::::::;;;;;;::clodxxkkkkOOOOO0000000OkdoldO0KKKOo;';c;'',.',,'';;::,,;::,.';::lO000
......... ...... ....     ...,:c::c:::;;;,,:::::;;::::cloddxkkOOOOOO0000KKKXKK0OdoodxOOXXK0o;::,','.':;',::;,,,;c:;;,,''',;oOOOO
. ............'.  ...........',,;,,codoolllooooooodddxxkkkkkOOO000000KKKK0OOOkkxxkOO0XXXXkl;',:;',;..,;,:ccc:,',;;,;,'.',';dkkkk
'..'................'...........,,,:odxxxddddddddxkkkkkkkxkkkOOOOOO000OkxddxxOOO0KKKKXKko:,,'.''.,,'''.;llcc:;,,;;',;:'.';lxxxxx
.....'''...........'..','.',,,''''',;;cdkkxxdddxxxkxdoodooddxxdoddddxkxxxkkO0KXKKKKK0oc;,'.;:,....';c,':llccc:;,:;,,,:;..;oddddx
'.''.....................','....','..,;;lxkkkkkkkkkxxxxddddxxxxdxxdxkOOO000KKXXXKOxdl;,;:,..::'':,.;l;.,clcc:,,;:,,'.,'.':oooodd
...............,'...''...........'...'..,cxOOOOkkkOOOOkkkkkOOOOOOOk0KKKKKKKKKK0kd:,;cc,',;'..'.,:,.';;'..',,'..'.',,,...;llllloo
..''...........'....''...............'.'';dOOOOOOO0OOOO00K00000OO0KKKKXK0Okxdl:;;,'';:'.','.......,..':c;';:;,'..,,,;;..:cccclll
......'..............',''............'''.'d00O000000OO000K000K0000K00kdooc:::;,,,...','.,cc;..'...,...;:;'',,;:,.''',;,,:c:ccccc
..................'......................;k0000000K00000K00KKK0Okxollc;;:;,'',,''.',;,...',,'''.''.'..,:;..,'..'..,:,.',;:::c:::
........'....  ..''....''.......      ...:dkO000koodkkxxkkkkOxl:,'',,'.';'''.,::'.,:;''''...','..'..'.',,,.,;'.',,;;;;;,,,;::;;;
....'.....''.....'......,,,'''.... ....   ..',,,...................'..........,;'.;:'';:;'.''..''....,,'',''''',;;,'';:;'',,,,,;
...............'.....'..'','''''',....'''..                   .............''..,'.,,..',;,,,'..,,,...,,''',,,'.''.',,,,,'''',',,
......''..'.................'.'''...;ll:,......   .,:;;;,,'....'......'ll;..,..;,':;.','',,,'','',,''''',::;:;'',.',',,''.'''',,
.........''...'''............''....,oxl,..';;;;:;..lOOOOOkxl:,';:;;,''',;,,,',',,.,,.',,'.,'.',,'.,,,,,'',;;;'''...'',;,'.''''''
.............,'''...............',;coc:cclddc;:dd'.,x0KKKK0xl:;,;;,,,',,'.',',,,;,','.''..'..',,',,,';:;,,,,,;:,',,'',;,...'''''
................''.'.........''';cxOxdxk000ko::ld;..:OKKKKKOdc;,;;,',,',;,',,''';:,''',,,'''.,:;,;;;;::,;;,,;;'..''''';:;......'
............'''..........'...,,,okOOOOO0000Oxl:cdo' .l00KKK0dl;,,;;'''',,,.','''''''..',,',,',,',;;;;::;;,,;:;,,,'.',,,:dl......
............................'''ckOOOOOO00000koccokxlok0KKXX0koc;,;;,'''',,'..',;,,,',,,::;:;,,',;;::;,;,',',;,,,;,'..',;lo;.  .'
''...........................':dkkOOO000000OkxooxO000KKKKXXKOdc;,,;;;;;;,,'''',;;,,,,,';;,,',;;',:c:;;;,,;,;;;,,,,,''',;:c::;',x
;;;,,'''.......... .......'.':dxxkkkOOOOOOOOOkOOO000000KKKKKOdc;'';c:,:ddc'..';;,'',:;,;;,,;,,;,,;c;,;,,;;,,,,,',,''''',;::clllO
:::;;;;;;,,'''..........''';coddxxkkkOOOOOOOOOOOO000000000K0ko:,'.,::,'';,'',;:,',,,;;,,;,,;:;,,,::;;;,;;;',,'''''';:;;;;;;:lllO
::;;;;::::::;;;;,,,,,,;:llloddddxxxkkkOOkkOOkOOOOOO00OOOO00Oxl;,'..,;,,,''.,,;,..'.'',,.','.,'';;,,;;,,;,'....;;,,,,,;;;,,,:lllO
:::;;;::::cc::::::::cclooooddddxxkkkkkkkkkkkkkOkkkOOOkkkOOOOdc;,'...','';,',',,'''..''..,;'';'';,',;;'';,.',.''',,,,',;,;:cllllO
:::::::::cccccccclloodddddxxxxxxkkkkkOOkkOOkkOOkkkkkkkkkOOOkdc;,,'......'..'....''',,.',,'';,.,:,.,;'.;:'.,;;;'',,,,,''';cclc:oX
cc:::::ccclollooddddxxxxxxxxkkkkOkOOOOOOOOOOOOOkkkkkkkkOOOOOdl:::::;''''..',;;,'...''.','..,'..'.......''',,;;;:;,;;,,,,,;;:lxXM
cccccccllooddddddddxxxxxkkxkkkkkOOOO000000000000OOOOkOOOO0OOkxdxxxxdollllloxkkxoc;,'''''''',;;::c:;,'.........'''''....',coOKXNM
ccccclllooddddoooddxxxxkxxxkkkxxkOOO00000KKKKKK00000OOO00000K00O00OOOOO0000KKKK0OxdoolloodxxkOO000Okdlc:;,,,;:cloolc::cok0KXKKNM
lccccllooodddddddddxxxxxxxkkkxxxkOOO0000000KKK0KK00K00KK0KKKKKK0K00000KKKXXXXXXKXK00OOOO0KKKKKKXXXXKK00OkxxkkO0KKXKK00KKXXXKKKNM
lcccccllooddddxxddxxxxxxxxkxxxkkkOOO00000000K00KK00KK0KKKKKKKKKKKKKKXXXXXXXXXXXXXXXXXXXXXXXXXXXXKXKKXXXXXXXXXXXXXXXXXXXNXXKKK0XW
cccccllloooddddxxxxxkkkkkkxxxxkOOOO00000K000K000000K00KKKKKKKKKKKKKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKK0KXXXXXXXXXXXXXXXXXXXXKKKK0XX
cccccllllooddddddxxxkkkkkkkkkkOOO0000000KK0K00000O0KK0KKKKKKKKKKKKKKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKXXXKK0KK0XO
cccccllllooooddddxxxxxxkkkkkkkOOOOOO00000000000000KKKKKKK0KKKKKKKKKXXXXXXXNXXNXNNXNNXXXXXXXXXXNXXXNXXXXXXXXXXXXXKKKKKKXKK0000OOo
cccccclllloooddddxxxxxxxkkkkkkOkkkkOO00000000KKK000KK00K0KKKKKKKXXXXXXXXXNNNNNXXNNNNNNXXXXXXXXXXXXNNNXXNXXXXXKKXKKKKKKKKK000Okl'
cccccccllllloooodxxxxxxxxkkxxkkkkkkkOO00000000000000KK0000KKKKKXXXXXXXXXXXXNNNNNXXNNNXXXXXXXKXXKXXNNNNNNXKXNNXXXXXKKXXK00000Ox;.
ccccccccclllloooddddddxxxxkkkkkkkOOOO00000000KKK0000KKKK000KKKKKKXXXXXXXXXXXXXXNXXXNNNXXXXXXKXKKXNNNNNNNNXNNNXXXXXXKKKKK0000Od,.
ccccccccccllllooodddddddxxxxkkkkkO0O000000000KKKKK00KKKK00KKKKKKKKKKKKKKXKKXXXXXNNNXXNNNNNNXXKKXNNNNNXXXXNNNNXXXXXXXKKK00000Oo'.
ccccccccccccllooodddoooddxxxxxxkkO00000000000000K000KKKKKKKXKKKKKKKKKKKKKKXXXXNXXNXXXNNNNNXXXXXXNNNNNNXNNNNXNNNXXNNXXKKK000Okl''
cccccccc:cccllloooodooddxxxxxkkkkOOO0000000000000000KKKKKKKKXXKKKKKKKKKKKKXXXXNXNNXXXXXXXXXXXXNNNNNNNNNNNXNNXNNXXXNXXKKK00OOx:',
c:cc::c::::ccllooooooodddxxxxkkkkOOOOOO000000000000KKKKKKKKKKXXKKKKKKKKKKKKXXXXXXXXXXXXXXXXXXXNXXXNNNNNNNXNNXXNXXXXXXXKK0OOOdc;;
::::::::;:::cclllloooooddxxxxkkkkkOOOOO00000000000KKKKKKKXXKKXXXXXKKKXXXXXXXXXXXXXXXXXXXXXXXXXNXXXNXXXNNNXNNNNNNXXXXXKKK0OOd:;;c
::::::::;;;::ccllllllllodxxxxxkkkkkOOOOOOO000000KKKKKKKKKXXKKXXXXXXXXXXXXXXXXXXXXKKXXXXXXXXXXXXXXXXXXXXNNNXXNNNXXXXXKKKK0Kk;..;o
  )" << endl;

		PlaySound(TEXT("shrek.wav"), NULL, SND_ASYNC);

		
		system("pause");
		break;


	}

	}

}