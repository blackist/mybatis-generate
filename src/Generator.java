import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @Title: Generator.java
 * @Package
 * @Description: ��� java����������ܺ���
 * @Company: www.xzit.edu.cn
 * @author Mr.Black 1075512174@qq.com
 * @date 2015��11��29�� ����10:11:39
 * @version V1.0
 */
public class Generator {

	public static void generate() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}

	public static void main(String[] args) {
		try {
			generate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
