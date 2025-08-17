import java.util.*;
import java.util.concurrent.*;

/*

aaaaaaaaoo*okhkkhhhhkkkkaakkbbdkbbbpppqbppX>YbZmdqqwwwwqZ0qpC+<;lZmZqqqpw0Oqwqwpn]OqwdqwwwqpbbdbdpaMMokwJb#Wddaok{?>l><I~_i?Uooaooooooa
oooooooo*oohkhkkhbhhkkkkohkbdddkdddpqqpdqw(iYdZwqmwwmmm0LZmqX<>:'twOwmwqwZ0mmmmwC~fwmpbmwwwqdbddbphM#MkCZ*W&kdaaowcx]<+]~?(cqoaaaaaaaaa
*******oooadkkkkhdhhkkkkokkddddbpppqqqppqQ_>YqOmmZZZZZmYYZZwv<i"'lLZmZZmZZ0ZOZZZO}>UmmbwZmwwqdppbdkMWoZZkhopbdaadXQ#nYCfjqpXXqoaaaaaaaa
******ooooambkkkhdakkkkkobbddppbqqwmwmwqmc<>zm0ZOO00OOOxcZOZx>l`''/ZZO0QJ0OOQQ0OO/i(ZZqpZOZZmZmqpdb#W#ho#hQOobhkJzop~z8buC#kJr0oaaaaaaa
**********kQbhkkhdhkkkbkobdppqppwmmmZZmmO/>;xOQQLQLL0QQ|n0Q0f>I`''lJ0QLCjCQO0OZZZUf\CZmqmOZZm0Cqqpda###*oOQo#haqzO&x<C#*r]q**qYoooooooa
*********#pJbkkkhpakkkbkadppqqqpmZOOO0mZOf){zZZ000000LC[fLJC\i:'``'(QCJC/nQLCJJznn>^[UUYJCJCLJ/Zmqpk*oooZQa**aaOUwc~(ka*0~jmw00aooooooa
*******##ZUCkkkkkphkbbbhappqwwwwZOZO00ZQU{_I/CJYYYYJCCJ_}UYY(!"'```;cUXYf}zzzccv|n~":xzvjYXYUU[zZwqmJahkwo*o*ahpLu//nbhha)]Zwqkaaoooooa
******#hr\U0hkkhkqhkbbbhapqmZZZC0QCJJJXUn~;.]YXvvvuvucn>>vcc1!^'```']zcvr+/unnnn{/_"'1nr}jvvzX]\QOwQ{bkkaa*#*ahkkhkr?LakoJ<Y*oooooooooa
*****#p((dQmhkkhkqhhbbdkhqwmZZQvLCUYXXnzf<".>uuxxxxx/nji:fnu}l"'''''"/nxr++xrjjx}[-"'>j(?+jjvc]-U0mJ<LabhoaM#ahkkha/>chkkd])aaaaooooooa
*****a\(k*LpkkkakqkhkbdkhqwZO0L/YYXcvvjn\i`';ffjjfjj{f/!`1xr[;^`''''.i(fj?;(fttf]>-"':/}~"]?tr_lxQOv!)bkkOvqMakkkhaj>tkkpkx+moaaooooooa
****#b/C#hQbkbk#hqbhbbdbhqwZ0QC)uYcvnv\j(!`'`()ttfjj]\\!'<tf?:'''''''`>{f}:>1/\)_:<^'`+<l`:I;_>,}Y0\!{pk0->~vhkkkhoc<}pkqbQ<voaaooooooa
*****#kZqZOkkkh&awdhbbdbhqmO0LC}tununu)|);'''-]1|))\<}|l',-1_"''''''''"l}-:`l+_>;^:^''^l,``"',;`!/U?l[Xn1{{+;uhkkhaQ+_Zkwqq]1aoaooooooo
aoooooooobqkkb*&hwphbdddhqwOQLC1}f?jnr)_1:''',il~>>~;:_;'':Il^'''''''''`^;,'``:,`'`''.........''`-v<l>!~]+!iI-dkkhap]~Cbwqd|+w*oooooooo
aaoooooookdkkk&WhqphkbbbhpqZQLC\<\<i\t]l>:'''',,:,^``'^^''''`''''''''''''`'''`^`^";i_})|jj)[??_:._nilll~ii>i;)bkkhaa|>vbwqbn>J#oaoooooo
oo***ooookbkka8Mapwhhbbdhbqm0LLf>~<";~:""^'^,:;I;:"^``^`''''''''''''''''''''^I~1juvunrjjruYQZqqJffr!li_<!llI|pkkkaaov>/dwqkJ<vooaoooooo
oo******oqkkb*8#abwbabbdhkpqO00n<l;"`:<[)jUZQUYXcuxt)?!,`'''''''''''''''''''l{\}<;^'.......'"l__l|fll+[-<Iivhakkkaaa0+{pwqkZ{naoaoooooo
*****o**kQkkhM&#akqdakkbhpqmmOOU?l:l]nZdmc(_l;:,:;l<_}]i^''''''''''''''''''',^'..''''''''''''...`t/I~]<I"<Oohhkkkoaad)]Oqqhdfjhooaooooo
***ooooo0Yhbo&&oaapp*hkkhwQ0OmZZt+:;i-{-,...'''''''....``''''''''''''''''''''''''''''''''''''''`"u)!ll!"?bWkhkbkh*hkax1Jqqhkj\b*oaooooo
oooooaaovXhb*WMhhabqMohkkakmzpqpv[>:"`..''''''''''''''''''''''''''''''''''''''''''''''''''''''`^;Y}-<-)na8akhkbkh*kkoU(Uqbahj(q*oaooooo
aaaaaaahtXhk*##kkaap###okh&#mppJj}-!,"^',"''''''''''''''''''''''''`'''''''''''''''''''''''''''`^~Q(pkkoMo#kkhbbka*kkhq(xpaoax)Z*oaooooo
aaaaaaow)Ukh*o#dka*h*M#Wok#&MMd(l><!I,"``'''''''''''''''''''''''''""`''''''''''''''''''''''''`^^)m0WWMahoobkhbkka*kdbaj|qooaundoooooooo
aaaaahoC{Jha*a#bbha*aMoW&M*&&&&#0x([)l""`'''''''''''''''''''''''''^^`''''''''''''''''''''''''`",uoMM#ahhohbhkbbbookqboc{O*oobo*ooaooooo
hhhhhhav{Choohodpaho##a#M&&&8&WW&W###JI"^'''''''''''''''''''''''''`'''''''''''''''''''''''''`""!OMM*hkhaabkhbbbbohbZdQtfmoooooaoooooooo
haaaaaaj{0hoohadqahhMMaho#&&&WM###*##MQ>^^`''''''''''''''''''''''''''''''''''''''''''''''''`^"!vk##akkhakbakbbbkokbJJ()wooooooooooooooo
haaaaok\)mk*ohabZhhkaMohhaW&&M###oo*##Mp{"``'''''''''''''''''''''''''''''''''''''''''''''``^!fb*h#ohkkakbkoddbbkobpun]Loooooooooooooooo
haaaaoq)\qkoahahLkhkkoohkkMWW#***aa****#oY-"''''''''''''''''''''""^`'`^":^'''''''''''''''"_vk&Wbo#akkhhbb**dddbhabdvzCooaaooooooooooooo
hhhhham{/pbhhhaaCqhkkkahbk*WMo*ookaoo*ooo#aQ/>"'''''''''''''''''":"^`^^""`''''''''''''"<tO*&WMhm**hkkhbba&oddbh*hdhwaaaooaaoooooooooooo
aaaaaawnCpdhhhhhCQhkkkkhkkaWMoaaakhaooooooo##kQj-I^'..'''''''''''''''''''''''''''''^>\LhMM#M#MZO#*kkkddh&&kpdaoWkkaaakkaaaaaaaooooooooo
aaaaaaaaopqhhhhaOvbhbkkkkhk#Moaakbhaaaaaaaaaao**opJt?l^'.'''`''''''''''''''''''',+tQaMM#***##kvm#okhddkMWMbpk*##aahaahkkhaaaaaaoooooooo
hhhhhhhhapOhhhhaprOakkkbkkkaMohkbdkhbhhhhaahhhhaao#*ad0z|!"^''''''''''''''''^;>{0oMM#oooooo**Urb*ohbboMMM*pdaaoahhkhakbdkaaaaoooooooooo
hhhhhhhhabJbhhhhhcuakkbbbbhh#akbpdkbpkkkkhhkkkkhhaahaao##O1]_<I""",::,^`^,!+]}}j*ooooaaaaaa*m\Uaooho##*##ohbbbhkkkbdahpmkaaaaooaaaaaaaa
aaaaaaaaaaYZaahhaO\makbbbbkhaokdqdkqqkbbkkkkkbkkkhhkhhhhokf_~i;"`''"::;I>-[[[[]xoaaaohaahaakjnkaoo**oko*ooodppbbkkbwahwZdoaaoooaaaaaaaa
aaaaaaaaao0chhahhkjvakbbbbkohabpqdkmpbbbbkkbbbbbbhhkkkkhb]"'...'^";!!l;;;Il>~?-coaaaahhhkaknvbhahaabkpa*aaabppbbkkbZkhZZqooaooooooooooo
aaaaaaaaaabxmahaha0\wabbbbboahbqqddZpdddbbbbbbbbbkkbbbbaJ:""":li<++++_]+~~+-++<zohhhakkkkdXJhhkkkhhbbwaoahhbqpdbbbbOqb0wZhoaaaooooooooo
oooooooooaoJzbhaaaavvakbbbbhokbqwbqZddpdbkpmmwqpbhkbbbkoj,;;;>~ii;,^"Ii><<+~!iifkahkhkkkqQmahkbkbkhkqZkohhhkqqpddbbZZq0qZbaaaaaoooooooo
ooooooooooohcmbhaaodj0ahkbbbkbpbphmqbbpZUj1|UXnncU0mpwQY-:;;ll:^'''^:;;;;l<>lIl!}vOkoakbpbbkhbbbbbkkmZbhkbkbqqpppdbmQmQpmqooooooooooooo
oooooooooooop0ahaaahmUboakbbppmqaammCn(?++~+\Xznf([?+iI!!I:^`''`",;llI;:ll;;l!!I;I!?fCwbkbdbhdpqqwdkmZbkkpbbpqppppdq0ZQppOhooaaoaaaaaaa
oooooooooooookhoooakbqOO0mZbwwmwwY(->!!i>>>i!>}_!::::;I;"```",::;:"^`''`,I!lI;!i;;;;:;>{xYJYvrffun/zZObkhqpdpqqqpppdwmQdkOboaaaaaaaaaaa
ooooooooooooooo*#bc)_>i~_{(ffjXC{!!!!!!!i!!ll"'I<l::!;"^^",,,"^```^^",,::::;l!>i:::;:::,,;<[/jxuu\??vOwdhkwppwmwqqpppp0domwaaoaaaaaaaaa
oooooooooooooo#pji'     '^l<_-}jX};;:,"^^^,;ll` "i>Ii:`'''^""""""""^^^^^,I:,,;+!::::::::::::i[\(i:<<]LJ|nOwqqmmmwqqpppmbod0hooaaaaaaaaa
oooooooooooo*anI           .`;<_\J1        .^lI' .;~<>;"`'```''`'''`^^",::l;,:;!I;:;::::::;>-+:. I>>>/Q}l<}rCmmmwqqppppdhhOpoaaooaaoaaa
ooooooooooo#m-            ..  ',<(0r' . ..   `I;'  `!+<;,"^^`^":I!~+<~+l;:;>I;I!lI;;;;;;l>~!^. .,i>il:fn;;;;!fCCCLLQOZmqbodZhoaaaaaaaaa
oooooooooooX~^`^`'..      .`'.  '!\pX,      . ^;,'   ^>i;;:::::::!{]+<_<lll_<ll>"^^^^^",:"'  ..^ll:'  ^j_  ,rmv\{[]?--?[}uZ0dooaaaaaaah
oooooooooanI`'...'``'.     `". . .ivkJ;     ...^,^.   .:I;:::::::;>_-~_>!i_}]ii+;^^^""^'.  ...';:`     :t:~0okv?<~<<<<>i-rvcJ0dahhaaahh

我操了兄弟，给这玩意画上去真有用

 */

public class SlimeChunkDensity {


    //史莱姆区块判断
    public static boolean isSlimeChunk(long worldSeed,     // 世界种子，一个64位整数，可以通过/seed获取
                                       int  chunkX,        // 区块X轴坐标，32位整数
                                       int  chunkZ) {      // 区块Z轴坐标，32位整数
        Random rng = new Random(
                worldSeed +
                        (long)(chunkX * chunkX * 4987142) +
                        (long)(chunkX * 5947611) +
                        (long)(chunkZ * chunkZ) * 4392871L +
                        (long)(chunkZ * 389711) ^ 987234911L
        );
        return rng.nextInt(10) == 0;
    }

    //生成二维数组
    public static int[][] SlimeChunkMap(long worldSeed) {
        int[][] arr = new int[6250][6250];
        for(int Z = 0; Z < 6250; Z++) {
//            System.out.println();
            for(int X = 0; X < 6250; X++) {
                if(isSlimeChunk(worldSeed, X - 3125, Z - 3125)){
                    arr[Z][X] = 1;
                }else {
                    arr[Z][X] = 0;
                }
//                System.out.print(arr[Z][X]);
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        long worldSeed = 2277284842347939655L;
        int[][] arr = SlimeChunkMap(worldSeed);
        int slimechunknum;
        int maxslimechunknum = 0;
        int maxslimechunkX = 0;
        int maxslimechunkZ = 0;
        for(int Z = 0; Z < 6234; Z++) {
            for(int X = 0; X < 6234; X++) {
                slimechunknum = 0;
                for(int z = Z; z < Z + 16; z++) {
                    for(int x = X; x < X + 16; x++) {
                        if(arr[z][x] == 1) {
                            slimechunknum++;
                        }
                    }
                }
                if(slimechunknum > maxslimechunknum) {
                    maxslimechunknum = slimechunknum;
                    maxslimechunkX = X;
                    maxslimechunkZ = Z;
                }
            }
        }

        System.out.println("史莱姆数量" + maxslimechunknum);
        System.out.println("区块坐标" + (maxslimechunkX - 3125) + "," + (maxslimechunkZ - 3125));
        System.out.println("方块坐标" + ((maxslimechunkX - 3125) * 16) + "," + ((maxslimechunkZ - 3125) * 16));
    }
}
