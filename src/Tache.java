import java.util.Date;

public class Tache {
    private String _desc;
    private Date _dateExe;
    private Status _status;
    private Resolution _resolution;

    public Tache( String desc, Date date, Status status, Resolution resolution) {
        this._desc = desc;
        this._dateExe = date;
        this._status = status;
        this._resolution = resolution;
    }

    public String get_desc() {
        return _desc;
    }

    public Date get_dateExe() {
        return _dateExe;
    }

    public Status get_status() {
        return _status;
    }

    public Resolution get_resolution() {
        return _resolution;
    }


    public void set_desc(String _desc) {
        this._desc = _desc;
    }

    public void set_dateExe(Date _dateExe) {
        this._dateExe = _dateExe;
    }

    public void set_status(Status _status) {
        this._status = _status;
    }

    public void set_resolution(Resolution _resolution) {
        this._resolution = _resolution;
    }


}
