package com.bigdata.web.service.impl;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bigdata.web.dao.BContentMapper;
import com.bigdata.web.domain.BContentDO;
import com.bigdata.web.service.BContentService;

@Service
public class BContentServiceImpl implements BContentService {
	@Autowired
	private BContentMapper bContentMapper;

	@Value("${image.upload.dir}")
	private String imageDir;
	
	@Override
	public BContentDO get(Long cid){
		return bContentMapper.get(cid);
	}
	
	@Override
	public List<BContentDO> list(Map<String, Object> map){
		return bContentMapper.list(map);
	}

	@Override
	public List<BContentDO> news(Map<String, Object> map) {
		return bContentMapper.news(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return bContentMapper.count(map);
	}
	
	@Override
	public int save(BContentDO bContent){
		return bContentMapper.save(bContent);
	}
	
	@Override
	public int update(BContentDO bContent){
		return bContentMapper.update(bContent);
	}
	
	@Override
	public int remove(Long cid){
		return bContentMapper.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return bContentMapper.batchRemove(cids);
	}

	@Override
	public String saveImage(MultipartFile file) {
		String uuid = UUID.randomUUID().toString().replace("-", "");

		String[] imgName = file.getOriginalFilename().split("\\.");
		int len = imgName.length;
		try {
			if(len >= 2) {
//                StringBuilder path = new StringBuilder().append(this.getClass().getResource("/").toString().substring(5) + "static/img/");

				StringBuilder path = new StringBuilder().append(imageDir);
				System.out.println(imageDir);
				//获取输出流
  				File imgFile = new File(path.append(uuid).append(".").append(imgName[len - 1]).toString());
				if(!imgFile.exists())
				{
					imgFile.createNewFile();
				}
				OutputStream os = new FileOutputStream(imgFile);
				//获取输入流 CommonsMultipartFile 中可以直接得到文件的流
				InputStream is = file.getInputStream();
				int temp;
				//一个一个字节的读取并写入
				while ((temp = is.read()) != (-1)) {
					os.write(temp);
				}
				os.flush();
				os.close();
				is.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
			return "文件不存在";
		}
		return "/" + uuid + "." + imgName[len - 1];
	}

}
