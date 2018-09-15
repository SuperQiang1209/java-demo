package com.zhengq.designpattern._05builderpattern.example;

import com.zhengq.designpattern._05builderpattern.example.impl.BMWBuilder;
import com.zhengq.designpattern._05builderpattern.example.impl.BMWModel;
import com.zhengq.designpattern._05builderpattern.example.impl.BenzBuilder;
import com.zhengq.designpattern._05builderpattern.example.impl.BenzModel;

import java.util.ArrayList;

/**
 * 导演类
 * 
 * @ClassName: Director
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:10:50
 */
public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	/**
	 * A类型的奔驰车模型，先start，然后stop，其它什么引擎，喇叭一概没有
	 * 
	 * @Title: getABenzModel
	 * @Description: TODO
	 * @param: @return
	 * @return: BenzModel
	 * @throws
	 */
	public BenzModel getABenzModel() {
		// 清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		// ABenzModel的执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		// 按照顺序返回一个奔驰车
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/**
	 * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
	 * 
	 * @Title: getBenzModel
	 * @Description: TODO
	 * @param: @return
	 * @return: BenzModel
	 * @throws
	 */
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/**
	 * C型号的宝马车是先按下喇叭(炫耀嘛),然后启动，然后停止
	 * 
	 * @Title: getCBmwModel
	 * @Description: TODO
	 * @param: @return
	 * @return: BMWModel
	 * @throws
	 */
	public BMWModel getCBmwModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}

	/**
	 * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止
	 * 
	 * @Title: getDBMWModel
	 * @Description: TODO
	 * @param: @return
	 * @return: BMWModel
	 * @throws
	 */
	public BMWModel getDBMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}

	/**
	 * 这里还可以有很多方法，你可以先停止，然后再启动，或者一直听着不动，静止的嘛<br/>
	 * 导演类嘛，安装什么顺序是导演说了算
	 */
}
