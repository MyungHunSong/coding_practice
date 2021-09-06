package coding_hash01;

import java.util.Arrays;
import java.util.HashMap;

/*수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.*/

public class HashLv1 { // --start--
	
	
	public static void main(String[] args) {
		 String[] part = {"mislav", "stanko", "jino", "ana"};
		 String[] comp = {"stanko", "ana", "mislav"};
		 
		 
		 System.out.println("일중 Loop를 활용함 : " + solution1(part, comp)); 
		 
		 System.out.println("HashMap을 활용함 : "+solution2(part, comp));
		 
	}
	
	//첫번째 풀이 ( 루프를 만들어서 문제를 푼 방법 )
	private static String solution1(String[] participant, String[] completion) {
		// 1. Arrays를 통한 배열 정렬
		String answer = "";
		Arrays.sort(participant); // 두개의 배열을 정렬해 보다 더욱 명확하게 배열을 보여줄려고		
		Arrays.sort(completion);
		
		
		// 2. Loop를 활용한 두 배열의 비교
		int i;
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}		
		// 3. 만약 비교법이 여기 까지 온다면, 마지막 part에 있는 주자는 comp하지 못한것
		return participant[i];	
	}
		
	
	public static String solution2(String[] participant, String[] completion ) {
		String answer = "";
		// 1. HashMap 생성
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2. part에 해쉬맵 추가
		for(String player:participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1); //key에 해당하는 Value가 있으면 가져옴 (+1), 아니면 기본값을 0으로 지정하겟다는 함숨.
		}
		
		// 3. 완주한 사람들은 Integer Value를 1씩 빼는 동작을 한다. 그러면 남아있는 한 사람이 완주하지 못한 선수가 될 것이다.
		for(String player: completion) {
			hm.put(player, hm.get(player)-1);
		}
		
		// 4.part의 0이 아닌것을 찾는다.
		for(String key: hm.keySet()) { 
			// HashMap.keySet()함수 : HashMap이 들고 있는 전체 Key의 배열을 반환하난 함수
			if(hm.get(key) != 0) { // hm.get(key) : hm의 key에 해당하는 Value를 반환하는 함수
				answer = key;
				break;
			}
		}
		
		return answer;
	}
	
	
}// --end--


	
