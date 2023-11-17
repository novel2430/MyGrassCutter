-- 基础信息
local base_info = {
	group_id = 220023002
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
}

-- NPC
npcs = {
}

-- 装置
gadgets = {
	{ config_id = 2, gadget_id = 70350003, pos = { x = 35.413, y = -4.165, z = 33.051 }, rot = { x = 0.000, y = 90.000, z = 0.000 }, level = 1, persistent = true },
	{ config_id = 75, gadget_id = 70211001, pos = { x = 168.768, y = 9.469, z = 34.150 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 6, drop_tag = "战斗低级蒙德", isOneoff = true }
}

-- 区域
regions = {
}

-- 触发器
triggers = {
}

-- 变量
variables = {
}

--================================================================
-- 
-- 初始化配置
-- 
--================================================================

-- 初始化时创建
init_config = {
	suite = 1,
	end_suite = 0,
	rand_suite = false
}

--================================================================
-- 
-- 小组配置
-- 
--================================================================

suites = {
	{
		-- suite_id = 1,
		-- description = ,
		monsters = { },
		gadgets = { 2, 75 },
		regions = { },
		triggers = { },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================