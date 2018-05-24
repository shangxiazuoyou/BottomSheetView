package shangxiazuoyou.library.sheetview;

import android.view.View;
import android.widget.AdapterView;

public interface OnItemClickListener {

    void onItemClick(AdapterView<?> parent, View view, int position, long id);
}
