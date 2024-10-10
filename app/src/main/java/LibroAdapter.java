public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolder> {
    // ...
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Libro libro = libros.get(position);
        holder.tvTitulo.setText(libro.getTitulo());
        holder.tvAutor.setText(libro.getAutor());
        holder.ivPortada.setImageResource(libro.getPortada());
    }

}