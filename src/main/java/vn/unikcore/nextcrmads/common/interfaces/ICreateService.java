package vn.unikcore.nextcrmads.common.interfaces;

public interface ICreateService<T, R> {
    public T execute(R data);
}
