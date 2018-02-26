package entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2017/7/26.
 */
public class RecordsList implements Serializable {

    private static final long serialVersionUID = 7458970645458146851L;

    @SerializedName("records")
    private List<Records> records ;

    public List<Records> getRecords() {
        return records;
    }

    public void setRecords(List<Records> records) {
        this.records = records;
    }

}
