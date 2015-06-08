package com.sale.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;
import javax.annotation.Resource;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Goods;
import com.sale.model.Seller;
import com.sale.service.GoodsService;

public class GoodsAction extends ActionSupport {
	@Resource
	GoodsService goodsService;
	private Goods goods;
	private List list;
	private static final int BUFFER_SIZE = 400 * 400;
	private File upload;// 封装上传文件域的属性
	private String uploadContentType;// 封装上传文件的类型
	private String uploadFileName;// 封装上传文件名
	private String savePath;// 封装上传文件的保存路径

	private static void copy(File source, File target) {
		InputStream inputStream = null; // 声明一个输入流
		OutputStream outputStream = null; // 声明一个输出流
		try {
			inputStream = new BufferedInputStream(new FileInputStream(source),
					BUFFER_SIZE); // 实例化输入流
			outputStream = new BufferedOutputStream(
					new FileOutputStream(target), BUFFER_SIZE);// 实例化输出流
			byte[] buffer = new byte[BUFFER_SIZE]; // 定义字节数组buffer
			int length = 0; // 定义临时参数对象
			while ((length = inputStream.read(buffer)) > 0) { // 如果上传的文件字节数大于0
				outputStream.write(buffer, 0, length); // 将内容以字节形式写入

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != inputStream) {
				try {
					inputStream.close(); // 关闭输入流
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (null != outputStream) {
				try {
					outputStream.close(); // 关闭输出流
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String findGoodsListBySeller() {
		ActionContext ac = ActionContext.getContext();
		list = goodsService.getGoodsListBySeller((String) ac.getSession().get(
				"Id"));
		System.out.println(list);
		ac.getSession().put("list", list);
		return "success";
	}

	public String add() {
		/*String path = ServletActionContext.getServletContext().getRealPath(
				this.getSavePath())
				+ "\\" + this.getUploadFileName();		
		goods.setGoodsPic(this.uploadFileName);// 将上传的文件名称赋值给User类中的photo属性
		Seller seller=new Seller();
		seller.setSellerId(123456);
		goods.setSeller(seller);
		File target = new File(path); // 定义目标文件对象
		copy(this.upload, target); // 调用copy()方法，实现文件的写入
		goodsService.addGoodsBySeller(goods);*/
		return "addgoods";
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the upload
	 */
	public File getUpload() {
		return upload;
	}

	/**
	 * @param upload the upload to set
	 */
	public void setUpload(File upload) {
		this.upload = upload;
	}

	/**
	 * @return the uploadContentType
	 */
	public String getUploadContentType() {
		return uploadContentType;
	}

	/**
	 * @param uploadContentType the uploadContentType to set
	 */
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	/**
	 * @return the uploadFileName
	 */
	public String getUploadFileName() {
		return uploadFileName;
	}

	/**
	 * @param uploadFileName the uploadFileName to set
	 */
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	/**
	 * @return the savePath
	 */
	public String getSavePath() {
		return savePath;
	}

	/**
	 * @param savePath the savePath to set
	 */
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
}
