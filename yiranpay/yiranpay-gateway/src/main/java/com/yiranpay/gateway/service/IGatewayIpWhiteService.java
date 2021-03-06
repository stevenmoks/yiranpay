package com.yiranpay.gateway.service;

import com.yiranpay.gateway.domain.GatewayIpWhite;
import java.util.List;

/**
 * IP白名单Service接口
 * 
 * @author panda
 * @date 2020-01-09
 */
public interface IGatewayIpWhiteService 
{
    /**
     * 查询IP白名单
     * 
     * @param id IP白名单ID
     * @return IP白名单
     */
    public GatewayIpWhite selectGatewayIpWhiteById(Long id);

    /**
     * 查询IP白名单列表
     * 
     * @param gatewayIpWhite IP白名单
     * @return IP白名单集合
     */
    public List<GatewayIpWhite> selectGatewayIpWhiteList(GatewayIpWhite gatewayIpWhite);

    /**
     * 新增IP白名单
     * 
     * @param gatewayIpWhite IP白名单
     * @return 结果
     */
    public int insertGatewayIpWhite(GatewayIpWhite gatewayIpWhite);

    /**
     * 修改IP白名单
     * 
     * @param gatewayIpWhite IP白名单
     * @return 结果
     */
    public int updateGatewayIpWhite(GatewayIpWhite gatewayIpWhite);

    /**
     * 批量删除IP白名单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGatewayIpWhiteByIds(String ids);

    /**
     * 删除IP白名单信息
     * 
     * @param id IP白名单ID
     * @return 结果
     */
    public int deleteGatewayIpWhiteById(Long id);

    /**
     * 根据商户ID获取白名单对象
     * @param merchantId
     * @return
     */
	public GatewayIpWhite selectGatewayIpWhiteByMerchantId(String merchantId);
}
