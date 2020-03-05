package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.mapper.BrandMapper;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.vo.PageInfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    BrandMapper brandMapper;

    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> queryWrapper = null;
        if (!StringUtils.isEmpty(keyword)){
            // 该 like 方法内部会自动拼 %
            queryWrapper = new QueryWrapper<Brand>().like("name",keyword);
        }
        IPage<Brand> brandIPage = brandMapper.selectPage(new Page<>(pageNum.longValue(), pageSize.longValue()), queryWrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(brandIPage.getTotal(),brandIPage.getPages(),brandIPage.getSize(),brandIPage.getRecords(),brandIPage.getCurrent());
        return pageInfoVo;
    }
}
