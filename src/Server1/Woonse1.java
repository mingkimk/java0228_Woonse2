package Server1;

import java.util.Random;

public class Woonse1 {
	private static final String[]ws= {
			"������ � : �� ����",
			"������ � : �� ����",
			"������ � : ��� ����",
	};
	public String selWoonse() {
		return ws[new Random().nextInt(ws.length)];
	}

}

  