package com.cts.railway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class DataBase implements TrainDAO{
	
	private Train train;
	private int[][] Chart;
	private Queue<Passangers> rac;
	private Queue<Passangers> waitingList;
	
	public DataBase() {
		Chart = new int[3][4];
		rac=new LinkedList<>();
		waitingList=new LinkedList<>();
	}

	@Override
	public Passangers getPassanger(int pnr) {
		
		Optional<Passangers> pass = train.getSeats().stream()
						.flatMap(s->s.getPass().stream())
						.filter(c->c.getPnr()==pnr)
						.findAny();
		
		if(pass.isPresent()) {
			 return pass.get();
		}else {
			pass=rac.stream().filter(p->p.getPnr()==pnr).findFirst();
			if(pass.isPresent()) {
				return pass.get();
			}
			return waitingList.stream().filter(p->p.getPnr()==pnr).findAny().get();
		}
	}

	@Override
	public int[][] getChart() {
		return Chart;
	}

	@Override
	public void AddTrain(Train train) {
		this.train=train;
	}

	@Override
	public Train getTrain() {
		return train;
	}

	@Override
	public Seat getSeat(int no) {
		Optional<Seat> seat = train.getSeats().stream().filter(s->s.getSeatNo()==no).findFirst();
		return seat.isPresent() ? seat.get() : null;
	}

	@Override
	public void addwaitingList(Passangers pass) {
		waitingList.add(pass);
	}

	@Override
	public void addRac(Passangers pass) {
		waitingList.add(pass);
	}

	@Override
	public Queue<Passangers> getwaitingList() {
		return waitingList;
	}

	@Override
	public Queue<Passangers> getRacList() {
		return rac;
	}

	@Override
	public void removePass(Passangers pass,int seatno) {
		train.getSeats().get(seatno).getPass().remove(pass);
	}
}
