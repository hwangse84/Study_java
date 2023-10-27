package pack03.test;

import java.util.Random;

public class HorseDAO {
Thread[] threads;
	HorseDTO[] horseArr;
	private int rank;
	public HorseDAO(int inputNum) {
		horseArr = new HorseDTO[inputNum];
		for(int i=0; i<horseArr.length; i++) {
			horseArr[i] = new HorseDTO(i+1+".말");
			horseArr[i].setHorseThread(getHorseThread(horseArr[i]));
			horseArr[i].getHorseThread().start();
		}
	}
//	public void hseThread() {
//		threads=new Thread[5];
//		for (int i = 0; i < 5; i++) {
//			threads[i]=new Thread(()->{
//				System.out.println("출력1");
//			});
//		}
//		for (int i = 0; i <5; i++) {
//			threads[i].start();
//		}
//	}
	
	public Thread getHorseThread(HorseDTO dto) {
		Thread thread = new Thread(()->{
			while(isMove(dto)) {
				System.out.println(dto.getName() + " " + dto.getMove() + " m ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				dto.setMove(dto.getMove() + 30);
				horseMoving(dto);
			}
			if(dto.getRank()==0) {
				dto.setRank(++rank);
				if(rank == horseArr.length) {
					finish();
				}
			}
		});

		return thread;
	}
	private void finish() {
		System.out.println("순위 출력");
		for(int i=0; i<horseArr.length; i++) {
			System.out.println(horseArr[i].getName() + " " + horseArr[i].getRank() + " 등 ");
		}

	}


	public void horseMoving(HorseDTO dto) {
		dto.setMove(dto.getMove() + new Random().nextInt(30)+1);
//		dto.setName(dto.getName()+123);		
		
		System.out.println(dto.getName() + " " + dto.getMove() + " m ");
	}

	//100보다 작은 move값이면 true , false
	public boolean isMove(HorseDTO dto) {
		if(dto.getMove() < 100) {
			return true;
		}
		return false;
	}

}
