package Server1;

import java.util.Random;

public class Woonse1 {
	private static final String[]ws= {
			"오늘의 운세 : 개 조심",
			"오늘의 운세 : 차 조심",
			"오늘의 운세 : 사람 조심",
	};
	public String selWoonse() {
		return ws[new Random().nextInt(ws.length)];
	}

}

  