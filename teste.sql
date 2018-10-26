select a.imdbid_filme, b.poster, b.year, b.title, count(*) as count from filmeangular.comentario as a
LEFT JOIN  filmeangular.filme b on a.imdbid_filme = b.imdbid  GROUP BY a.imdbid_filme, b.poster, b.year, b.title ORDER BY count DESC


select imdbid, Title, poster, count(*) as c from filmeangular.filme group by imdbid, title, poster order by c desc




select
        comentario0_.imdbid_filme as col_0_0_,
        filme1_.poster as col_1_0_,
        filme1_.title as col_2_0_,
        count(*) as col_3_0_ 
    from
        filmeangular.comentario comentario0_ cross 
    join
        filmeangular.filme filme1_ 
    where
        comentario0_.imdbid_filme=filme1_.imdbid 
    group by
        comentario0_.imdbid_filme ,
        filme1_.poster ,
        filme1_.title 
    order by
        col_3_0_ DESC 
