package test;

import com.atguigu.gmall.product.mapper.SampleMapper;
import com.atguigu.gmall.product.pojo.Sample;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author 琉
 * @create 2021-12-30 23:20
 */
//@MybatisPlusTest
//public class MybatisPlusSampleTest {
//
//        @Resource
//        private SampleMapper sampleMapper;
//
//        @Test
//        public void testInsert() {
//            Sample sample = new Sample();
//
//            sampleMapper.insert(sample);
////            System.out.println("insert = " + insert);
//
//            AbstractIntegerAssert<?> notNull = assertThat(sample.getId()).isNotNull();
//
//            System.out.println("notNull = " + notNull);
//        }
//
//}
