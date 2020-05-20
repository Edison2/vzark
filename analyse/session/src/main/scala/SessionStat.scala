import java.util.UUID

import commons.conf.ConfigurationManager
import commons.constant.Constants
import net.sf.json.JSONObject

object SessionStat {

    def main(args: Array[String]): Unit = {
        // 获取筛选条件
        val jsonStr: String = ConfigurationManager.config.getString(Constants.TASK_PARAMS)
        // 获取筛选条件对应的object
        val taskParam = JSONObject.fromObject(jsonStr)

        val taskUUID = UUID.randomUUID().toString


    }
}
