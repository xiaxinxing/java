package spingclouddemo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 定时器
 */
@Component
public class TaskJob {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    /***
     * cron表达式
     * "秒（0~59）
     * 分钟（0~59）
     * 小时（0~23）
     * 天（月）（0~31，但是你需要考虑你月的天数）
     * 月（0~11）
     * 天（星期）（1~7）
     * 7.年份（1970－2099)"
     * 0/2 代表这个位置每隔2 执行一次
     * 0/2 在 分  单位上  代表2分钟执行一次
     * */
    @Scheduled(cron = "0 0/2 * * * ?")
    public void changeStatus() {
        logger.info("定时器每2分钟开始【{}】......", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        try {

        } catch (Exception e) {
        }
        logger.info("定时器每2分钟结束【{}】......", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
