package com.alibaba.Desinger.exer3;

public class CheckAccount extends Account {

	private double overdraft; //可透支额度
	
	//通过构造器给所有的属性赋值
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	

	public double getOverdraft() {
		return overdraft;
	}



	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}



	/*
	 * 	如果（取款金额<账户余额），
				可直接取款
		如果（取款金额>账户余额），
			计算需要透支的额度
			可透支额overdraft是否足够支付本次透支需要，如果可以
					将账户余额修改为0，冲减可透支金额
			不可透支
					提示用户超过可透支额的限额

	 */
	@Override
	public void withdraw(double amount) {
		//先判断是否需要透支
		if(amount <= getBalance()){//不需要透支
			//直接从余额中减去要取的钱即可
			setBalance(getBalance() - amount);
		}else{//需要透支
			
			//判断是否可以透支
			//1.计算透支的额度
			double overMoney = amount - getBalance();
			//2.判断是否可以透支
			/*
			 * overMoney : 是需要透支的额度
			 * overdraft : 可透支额度
			 */
			if(overMoney > overdraft){//不能透支
				System.out.println("超出透支额度");
			}else{//可以透支
				//2.1 从可透支额度中减去此次透支的钱
				overdraft -= overMoney;
				//2.2 余额设置为0
				setBalance(0);
			}
		}
	}
}













